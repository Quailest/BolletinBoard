package com.example.BolletinBoard.controller;

import com.example.BolletinBoard.controller.form.ArticleForm;
import com.example.BolletinBoard.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopController {

    @Autowired
    ArticleService articleService;

    @GetMapping
    public ModelAndView top() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/top");
        return mav;
    }

    @GetMapping("/new")
    public ModelAndView newArticle() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/new");
        return mav;
    }

    @PostMapping("/add")
    public ModelAndView postArticle(@ModelAttribute ("formModel") ArticleForm articleForm) {
        ModelAndView mav = new ModelAndView();
        articleService.articleSave(articleForm);
        return new ModelAndView("redirect:/");
    }
}
