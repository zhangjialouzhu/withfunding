package com.yuc.with_boot.utils;

import java.util.UUID;

public class UUIDUtil {
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");

    }
}
