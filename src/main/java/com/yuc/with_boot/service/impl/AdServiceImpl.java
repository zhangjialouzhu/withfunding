package com.yuc.with_boot.service.impl;

import com.yuc.with_boot.mapper.AdMapper;
import com.yuc.with_boot.service.AdService;
import com.yuc.with_boot.utils.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdServiceImpl implements AdService {
    private Logger logger = LoggerFactory.getLogger(AdServiceImpl.class);

    @Autowired
    private AdMapper adMapper;

    public List<Map<String, String>> getAds(Map<String, String> ads) {
        List<Map<String, String>> data = null;
        try {
            data = adMapper.adSearch(ads);
        } catch (Exception e) {
            logger.error("查询广告列表出错",e);
            e.printStackTrace();
        }
        return data;
    }

    public void adsInsert(Map<String, Object> map) {
        String uuid = UUIDUtil.uuid();
        map.put("uuid",uuid);
        try {
            adMapper.adInsert(map);
        } catch (Exception e) {
            logger.error("新建广告出错",e);
            e.printStackTrace();
        }
    }
    public void adUpdate(Map<String, Object> map) {
        try {
            adMapper.adInsert(map);
        } catch (Exception e) {
            logger.error("修改广告列表出错",e);
            e.printStackTrace();
        }
    }
    public void adsDel(List<String> ids) {
        try {
            adMapper.adDel(ids);
        } catch (Exception e) {
            logger.error("删除广告列表出错",e);
            e.printStackTrace();
        }
    }

}
