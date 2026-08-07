package com.amit.mvc_practise;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return "index.jsp";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int n1, @RequestParam("num2") int n2, ModelAndView m)
    {
        // Model m;

        int res=n1+n2;
        m.addObject("res",res);
        m.setViewName("output.jsp");
        return m;
    }
}
