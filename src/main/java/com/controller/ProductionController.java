package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/4/2.
 */
@Controller
@RequestMapping("/")
public class ProductionController {

    @RequestMapping(value="/hello" ,method= RequestMethod.GET)
    public String printWelcome(ModelMap model){
        model.addAttribute("message" ,"Spring 3 MVC Hello World");
        return "hello";
    }

}
