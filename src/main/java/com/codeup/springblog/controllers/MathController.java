package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

        @GetMapping("/add/{x}/and/{y}")
    @ResponseBody
    public int sum(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @GetMapping("/subtract/{x}/from/{y}")
    @ResponseBody
    public int difference(@PathVariable int x, @PathVariable int y) {
        return x - y;
    }

    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public int product(@PathVariable int x, @PathVariable int y) {
        return x * y;
    }

    @GetMapping("/divide/{x}/by/{y}")
    @ResponseBody
    public int quotient(@PathVariable int x, @PathVariable int y) {
        return x / y;
    }

}
