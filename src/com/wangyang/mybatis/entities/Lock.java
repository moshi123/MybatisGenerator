package com.wangyang.mybatis.entities;

public class Lock {
    private Integer id;

    private String lockname;

    private Integer keyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLockname() {
        return lockname;
    }

    public void setLockname(String lockname) {
        this.lockname = lockname == null ? null : lockname.trim();
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }
}