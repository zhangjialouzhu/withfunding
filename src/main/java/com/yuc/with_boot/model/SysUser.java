package com.yuc.with_boot.model;

import java.io.Serializable;

public class SysUser implements Serializable {
    private String id;
    private String name;

    public SysUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
