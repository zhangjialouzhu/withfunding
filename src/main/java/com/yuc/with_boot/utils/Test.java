package com.yuc.with_boot.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Map<String,String>> mapList = new ArrayList<Map<String, String>>();
        Map<String,String> map = new HashMap<String, String>();
        map.put("label","input");
        map.put("text","url:0");
        map.put("name","");
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("label","box");
        map1.put("text","默认:222");
        map1.put("name","动作");
        Map<String,String> map2 = new HashMap<String, String>();
        map2.put("label","box");
        map2.put("text","犯罪:0");
        map2.put("name","动作");

        mapList.add(map1);
        mapList.add(map);
        mapList.add(map2);
        System.out.println(mapList);




    }
}
