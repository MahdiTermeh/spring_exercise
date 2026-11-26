package com.mftplus.spring_exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @GetMapping
    public String welcomePage(){
        return "welcomePage";
    }

    @GetMapping("/save")
    public String save(@RequestParam String name,
                       @RequestParam String family,
                       @RequestParam int age,
                       Model model){
        System.out.println("name:"+name);
        System.out.println("family:"+family);
        System.out.println("age:"+age);
        model.addAttribute("name",name);
        model.addAttribute("family",family);
        model.addAttribute("age",age);
        return "hiPage";
    }
}
