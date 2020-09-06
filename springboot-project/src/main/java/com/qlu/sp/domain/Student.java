package com.qlu.sp.domain;

import java.util.Date;

public class Student {
    Integer id;
    String name;
    String stuNum;
    String clas;
    String telephone;
    String address;
    String goAddress;
    Date apartTime;
    Date returnTime;
    String remarks;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stuNum='" + stuNum + '\'' +
                ", clas='" + clas + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", goAddress='" + goAddress + '\'' +
                ", apartTime=" + apartTime +
                ", returnTime=" + returnTime +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoAddress() {
        return goAddress;
    }

    public void setGoAddress(String goAddress) {
        this.goAddress = goAddress;
    }

    public Date getApartTime() {
        return apartTime;
    }

    public void setApartTime(Date apartTime) {
        this.apartTime = apartTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
