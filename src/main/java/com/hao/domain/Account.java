package com.hao.domain;

import java.io.Serializable;

/**
 * @Describe com.hao.domain
 * @Auther wenhao chen
 * @CreateDate 2019/8/17
 * @Version 1.0
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;
    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
