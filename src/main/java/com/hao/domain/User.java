package com.hao.domain;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Describe com.hao.domain
 * @Auther wenhao chen
 * @CreateDate 2019/8/17
 * @Version 1.0
 */
public class User implements Serializable {

    private String uname;
    private Integer age;
    private Date date;

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
