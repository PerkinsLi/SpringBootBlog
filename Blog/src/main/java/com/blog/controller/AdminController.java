package com.blog.controller;

import com.blog.vo.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理员控制器
 */

@Controller
@RequestMapping("/admins")
public class AdminController {

    public ModelAndView listUsers(Model model) {
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("用户管理","/users"));
        model.addAttribute("list", menus);
        return new ModelAndView("admins/index", "model ", model);
    }

}
