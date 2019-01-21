package com.epam.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by student on 21.01.2019.
 */
@Controller
//localhost:8080/
public class AppController {
    @RequestMapping(value= "/")

    public String getHelloPage(Model model ){

        return "home";
    }

}
