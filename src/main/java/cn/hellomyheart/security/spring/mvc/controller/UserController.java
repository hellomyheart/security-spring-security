package cn.hellomyheart.security.spring.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 登录Controller
 * @className: UserController
 * @package: cn.hellomyheart.security.spring.mvc.controller
 * @author: Stephen Shen
 * @date: 2020/10/8 下午2:06
 */
@RestController
public class UserController {
    @RequestMapping(value = "/login-success",produces = {"text/plain;charset=utf-8"})
    public String loginSuccess(){
        return "登录成功";
    }
}
