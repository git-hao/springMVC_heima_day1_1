package com.hao.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Describe com.hao.domain
 * @Auther wenhao chen
 * @CreateDate 2019/8/17
 * @Version 1.0
 */
public class UserList implements Serializable {
    private List<User> list;
    private Map<String,User> map;

    @Override
    public String toString() {
        return "UserList{" +
                "list=" + list +
                ", map=" + map +
                '}';
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
