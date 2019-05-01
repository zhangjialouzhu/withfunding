package com.yuc.with_boot.service;

import java.util.List;
import java.util.Map;

public interface AdService {
    /**
     * 获取还留有时间显示的广告
     * @return
     */
     List<Map<String,String>> getAds(Map<String, String> ads);
    /**
     * 添加广告
     */
     void adsInsert(Map<String, Object> map);
    /**
     * 更新广告
     */
     void adUpdate(Map<String, Object> map);
    /**
     * 删除广告
     */
     void adsDel(List<String> ids);
}
