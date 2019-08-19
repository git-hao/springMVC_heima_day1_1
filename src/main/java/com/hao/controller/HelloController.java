package com.hao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Describe com.hao.controller
 * @Auther wenhao chen
 * @CreateDate 2019/8/14
 * @Version 1.0
 *
 * RequestMapping：
 *      写在类上，表示类中的所有方法的请求路径，都在类之后
 *      path == value
 *      path = "/miao"  ==  value = "/miao"
 */
@Controller
@RequestMapping(path = "/miao")
public class HelloController {

    /**
     * method:
     *      指定请求的方式
     * @return
     */
    @RequestMapping(path = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String sayHello(){
        System.out.println("hello controller");
        return "success";
    }

    /**
     *
     * @return
     *
     * params:
     *      指定限制请求参数的方式，支持简单的表达式，要求请求参数的key：value必须和配置的一样
     *          例如：params={"username"},表示请求参数必须有username
     *                  params={"age!=10"},表示请求参数必须有age，而且不能等于10
     * headers:
     *      指定限制请求消息头的条件
     */
    @RequestMapping(path = "/miaonei/hello",params = {"username"},headers = {"Accept"})
    public String sayMiaonei(){
        System.out.println("hello miaonei");
        return "success";
    }
}
