package com.sx.controller;

import com.sx.pojo.Article;
import com.sx.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author shengx
 * @date 2020/3/15 21:30
 */
@RestController("/")
public class IndexController {

    @Autowired
    private ArticleService articleService;
    @RequestMapping("/article")
    public ModelAndView index(ModelAndView modelAndView){
        Page<Article> articles = articleService.getArticlePage(0, 2);
        modelAndView.addObject("articles", articles);
        modelAndView.setViewName("client/index");
        return modelAndView;
    }

    @GetMapping(value = "/article/page/{page}")
    public ModelAndView articleByPage(ModelAndView modelAndView, @PathVariable Integer page){
        Page<Article> articles = articleService.getArticlePage(page - 1, 2);
        modelAndView.addObject("articles", articles);
        modelAndView.setViewName("client/index");
        return modelAndView;
    }
}
