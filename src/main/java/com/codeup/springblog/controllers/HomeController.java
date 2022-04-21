package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/landing")
    @ResponseBody
    public String land() {

        return "THIS IS THE LANDING PAGE";

    }
}