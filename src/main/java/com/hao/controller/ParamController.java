package com.hao.controller;

import com.hao.domain.Account;
import com.hao.domain.User;
import com.hao.domain.UserList;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Describe com.hao.controller
 * @Auther wenhao chen
 * @CreateDate 2019/8/15
 * @Version 1.0
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username,Integer age){
        System.out.println("喵内参数测试执行啦,name:"+username+"---age:"+age);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){

        System.out.println(account);
        return "success";
    }

    /**
     * 请求参数数据，封装到javabean，集合类型
     * @param userList
     * @return
     */
    @RequestMapping("/saveList")
    public String saveList(UserList userList){
        System.out.println(userList);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * 使用servlet原生API
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("request.cookie="+request.getCookies());
        System.out.println("ServletContext="+request.getSession().getServletContext());
        System.out.println("response.toString="+response.toString());
        return "success";
    }
}
