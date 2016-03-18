package com.wangyang.mybatis.entities;

public class Dog {
    private Integer id;

    private String dogName;

    private Integer dogWeight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName == null ? null : dogName.trim();
    }

    public Integer getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(Integer dogWeight) {
        this.dogWeight = dogWeight;
    }
}