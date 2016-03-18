package com.wangyang.mybatis.entities;

public class Dept {
    private Integer id;

    private String deptname;

    private String locadd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getLocadd() {
        return locadd;
    }

    public void setLocadd(String locadd) {
        this.locadd = locadd == null ? null : locadd.trim();
    }
}