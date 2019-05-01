package com.yuc.with_boot.mapper;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 对ad表进行数据操作
 */
@Repository
public interface AdMapper {
    /**
     * 查询数据
     * @return
     */
    List<Map<String,String>> adSearch(Map<String, String> ads) throws Exception;
    /**
     * 添加数据
     * @param map
     */
    void adInsert(Map<String, Object> map) throws Exception;
    /**
     * 更新数据
     * @param map
     */
    void adUpdate(Map<String, Object> map) throws Exception;
    /**
     * 删除数据
     */
    void adDel(List<String> ids) throws Exception;
}
