package com.bw.homework;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class MyEntity {

    @Id
    private Long id;
    public String phone;
    public String pwd;
    @Generated(hash = 272214034)
    public MyEntity(Long id, String phone, String pwd) {
        this.id = id;
        this.phone = phone;
        this.pwd = pwd;
    }
    @Generated(hash = 958988922)
    public MyEntity() {
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPwd() {
        return this.pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
