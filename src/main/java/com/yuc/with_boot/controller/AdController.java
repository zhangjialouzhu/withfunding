package com.yuc.with_boot.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuc.with_boot.service.AdService;
import com.yuc.with_boot.utils.JSONResult;
import com.yuc.with_boot.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class AdController {
    @Autowired
    private AdService adService;

    @RequestMapping(value="/adSearch")
    public JSONResult getSearch(@RequestParam Map<String,String> ads){
        int pageNo = Integer.parseInt(ads.get("pageNo"));
        int pageSize = Integer.parseInt(ads.get("pageSize"));
        JSONResult jsonResult = new JSONResult();
        PageHelper.startPage(pageNo,pageSize);
        List<Map<String, String>> list = adService.getAds(ads);
        PageInfo<List> pageInfo = new PageInfo(list);
        jsonResult.setData(pageInfo);
        return jsonResult;
    }

    @RequestMapping(value="/adInsert")
    public JSONResult adInsert(@RequestParam Map<String,Object> map){
        JSONResult jsonResult = new JSONResult();
        map.put("uuid", UUIDUtil.uuid());
        try {
            adService.adsInsert(map);
            jsonResult.setSuccessInfo("1");
        }catch(Exception e){
            jsonResult.setErrorInfo("0");
        }
        return jsonResult;
    }

    @RequestMapping(value="/adUpdate")
    public JSONResult adUpdate( Map<String,Object> params){
        JSONResult jsonResult = new JSONResult();

        try {
            adService.adUpdate(params);

            jsonResult.setSuccessInfo("1");
        }catch(Exception e){
            jsonResult.setErrorInfo("0");
        }
        return jsonResult;
    }

    @RequestMapping(value="/adDel")
    public JSONResult adDel( List<String> ids){
        JSONResult jsonResult = new JSONResult();

        try {
            adService.adsDel(ids);
            jsonResult.setSuccessInfo("1");
        }catch(Exception e){
            e.printStackTrace();
            jsonResult.setErrorInfo("0");
        }
        return jsonResult;
    }



}



