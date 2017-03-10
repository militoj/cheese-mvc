package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by johnmilito on 3/9/17.
 */

@Controller
public class CheeseController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "My Cheese";

    }
}
