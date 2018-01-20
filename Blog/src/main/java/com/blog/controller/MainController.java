package com.blog.controller;

import com.blog.domain.Authority;
import com.blog.domain.User;
import com.blog.service.AuthorityService;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页控制器
 */
@Controller
public class MainController {

    private static final Long AUTHORITY_ROLE_ID = 2L; //普通博主角色

    @Autowired
    private UserService userService;
    @Autowired
    private AuthorityService authorityService;

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登录失败, 用户名或密码错误！");
        return "login";
    }

    @GetMapping("/register")
    public String register(User user) {
        List<Authority> authorities = new ArrayList<>();
        authorities.add(authorityService.findAuthorityById(AUTHORITY_ROLE_ID));
        user.setAuthorities(authorities);

        userService.registerUser(user);
        return "redirect:/login";
    }
}
