package com.yuc.with_boot.utils;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URLConnection;

public class FileUtil {
    public static void main(String[] args) throws Exception{
        /*String fileUrl = "ftp://zhangjialouzhu:cyxxzzq520@192.168.7.159/C:/Users/yuc/Downloads/kotlin-reflect-1.1.51.jar";
        URL url = new URL(fileUrl);

        URLConnection urlconn=url.openConnection();
        BufferedReader  br=new BufferedReader(new InputStreamReader(urlconn.getInputStream()));
        String  line;
        while(null!=(line=br.readLine()))
        {
            System.out.println(line);
        }*/

        URI uri = URI.create("http://www.baidu.com") ;
        URLConnection urlConnection = null;
        try {
            urlConnection = uri.toURL().openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            InputStream inputStream =urlConnection.getInputStream() ;
            InputStreamReader isr = new InputStreamReader(inputStream) ;
            char[] c = new char[1024] ;
            while (isr.read(c)!=-1){
                System.out.print(c) ;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
