package com.yuc.with_boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Value("${win.path}")
    String winPath;
    @Value("${linux.path}")
    String linuxPath;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @RequestMapping(value = "/test")
    @ResponseBody
    @CrossOrigin
    public String uploadFile(@RequestParam(value = "pic") MultipartFile multipartFile, HttpServletRequest request) {
        File folder = new File(getPath());
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String filePath = getName(multipartFile);
        try {
            multipartFile.transferTo(new File(filePath));
        }catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
        }
      /*  InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] bytes = new byte[1024];
        try {
            inputStream = multipartFile.getInputStream();
            outputStream = new FileOutputStream(getPath()+"/"+System.currentTimeMillis()+".txt");
            while (inputStream.read(bytes) != -1) {
                outputStream.write(bytes);
            }
            outputStream.flush();
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        }
*/
        return filePath;
    }

    private String getPath() {
        String path = "";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            path = winPath;
        }
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            path = linuxPath;
        }
        return path;
    }

    private String getName(MultipartFile multipartFile) {
        String name ="";
        try {
            String originName = multipartFile.getOriginalFilename();
            name = getPath()+"/"+System.currentTimeMillis()+originName.substring(originName.lastIndexOf("."),originName.length());
        }catch (Exception e){
            e.printStackTrace();
        }
        return name;
    }
}
