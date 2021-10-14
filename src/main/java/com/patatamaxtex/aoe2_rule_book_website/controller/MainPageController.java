package com.patatamaxtex.aoe2_rule_book_website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class MainPageController {

    @GetMapping
    public String getMainPage(Model model){

        return "main_page";

    }
}
