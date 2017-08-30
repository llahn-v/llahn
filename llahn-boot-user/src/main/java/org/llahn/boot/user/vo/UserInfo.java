package org.llahn.boot.user.vo;

import java.util.Date;

public class UserInfo {
    private Integer luId;

    private String luName;

    private String luAdmin;

    private String luPasswd;

    private String luSex;

    private Integer luAge;

    private String luTelphone;

    private Date luCreateTime;

    private Date luLastmodTime;

    public Integer getLuId() {
        return luId;
    }

    public void setLuId(Integer luId) {
        this.luId = luId;
    }

    public String getLuName() {
        return luName;
    }

    public void setLuName(String luName) {
        this.luName = luName == null ? null : luName.trim();
    }

    public String getLuAdmin() {
        return luAdmin;
    }

    public void setLuAdmin(String luAdmin) {
        this.luAdmin = luAdmin == null ? null : luAdmin.trim();
    }

    public String getLuPasswd() {
        return luPasswd;
    }

    public void setLuPasswd(String luPasswd) {
        this.luPasswd = luPasswd == null ? null : luPasswd.trim();
    }

    public String getLuSex() {
        return luSex;
    }

    public void setLuSex(String luSex) {
        this.luSex = luSex == null ? null : luSex.trim();
    }

    public Integer getLuAge() {
        return luAge;
    }

    public void setLuAge(Integer luAge) {
        this.luAge = luAge;
    }

    public String getLuTelphone() {
        return luTelphone;
    }

    public void setLuTelphone(String luTelphone) {
        this.luTelphone = luTelphone == null ? null : luTelphone.trim();
    }

    public Date getLuCreateTime() {
        return luCreateTime;
    }

    public void setLuCreateTime(Date luCreateTime) {
        this.luCreateTime = luCreateTime;
    }

    public Date getLuLastmodTime() {
        return luLastmodTime;
    }

    public void setLuLastmodTime(Date luLastmodTime) {
        this.luLastmodTime = luLastmodTime;
    }
}