package com.example.login_42_tester.payroll;

import com.example.login_42_tester.config.auth.LoginUser;
import com.example.login_42_tester.config.auth.dto.SessionUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }
}
