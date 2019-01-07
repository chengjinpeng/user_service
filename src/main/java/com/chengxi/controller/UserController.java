package com.chengxi.controller;

import com.chengxi.pojo.TUser;
import com.chengxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author chengxi
 * @date 2018/12/3 09:28
 */
@RestController
@RequestMapping(value = "/userService")
public class UserController {

     @Autowired
     private UserService userServiceImpl;

     @GetMapping(value = "/{id}")
    public TUser selectUserById(@PathVariable Integer id) throws InterruptedException {

         // 为了演示hystrix熔断机制，这里设置返回超长时间，让其调用失败回滚函数
         // （默认是超过1000毫秒执行,最好重新设置因为重试机制的时间也是1000毫秒，且熔断机制的优先级高于重试机制，所以熔断机制的值要设置比重试机制高）
         int longTime = new Random().nextInt(8000);
         Thread.sleep(longTime);
         System.out.println("longTime:"+longTime);

      return   userServiceImpl.selectUserById(id);
    }


}
