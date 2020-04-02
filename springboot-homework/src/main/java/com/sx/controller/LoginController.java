package com.sx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

/**
 * @author shengx
 * @date 2020/4/1 21:54
 */
@Controller("/login")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginGet(ModelAndView modelAndView){
        modelAndView.setViewName("login/login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public RedirectView loginPut(RedirectAttributes redirectAttributes, HttpSession session, String username, String password){
        if(username !=null && password !=null){
            session.setAttribute("username", username);
        }
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("article");
        System.out.println("login success");
        return redirectView;
    }
}
