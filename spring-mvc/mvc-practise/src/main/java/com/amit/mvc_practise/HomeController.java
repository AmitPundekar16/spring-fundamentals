package com.amit.mvc_practise;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(int num1,int num2, HttpSession ses)
    {

        int res=num1+num2;
        ses.setAttribute("res",res);
        return "output.jsp";
    }
}
