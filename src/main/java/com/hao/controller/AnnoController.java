package com.hao.controller;

import com.hao.domain.User;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @Describe com.hao.controller
 * @Auther wenhao chen
 * @CreateDate 2019/8/17
 * @Version 1.0
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = "miao")  //miao=miaonei,存入session域中，@SessionAttributes只能在类上使用
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){

        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{uid}")
    public String testPathVariable(@PathVariable(name = "uid")String id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Accept")String header){
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * 第一种使用方法,ModelAttribute修饰有返回值方法
     */
//    @RequestMapping("/testModelAttribute")
//    public String testModuleAttributes(User user){
//        System.out.println("testModelAttribute执行了。。");
//        System.out.println(user);
//        return "success";
//    }
//
//    /**
//     *     ModelAttribute:放在方法上，当前方法会在所有控制器方法执行之前执行，
//     *     使用场景：当表单数据提交不完整时，保证没有提交数据的字段使用数据库对象原有的数据
//     */
//    @ModelAttribute
//    public User show(String uname){
//        System.out.println("show执行了。。");
//        //模拟返回一个user对象
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(10);
//        user.setDate(new Date());
//        return user;
//    }

    /**
     *
     * 第二种方法：,ModelAttribute修饰没有返回值方法
     *
     */
    @RequestMapping("/testModelAttribute")
    public String testModuleAttributes(@ModelAttribute("User") User user){
        System.out.println("testModelAttribute执行了。。");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void show(String uname, Map<String,User> map){
        System.out.println("show执行了。。");
        //模拟返回一个user对象
        User user = new User();
        user.setUname(uname);
        user.setAge(10);
        user.setDate(new Date());
        map.put("User",user);
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        //底层会存储到request域中
        model.addAttribute("miao","miaonei");
        return "success";
    }
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap model){
        //获取值
        String s = (String) model.get("miao");
        System.out.println(s);
        return "success";
    }
    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus status){
        //设置session状态已完成，删除内容
        status.setComplete();
        return "success";
    }

}
