package com.miguel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value");
        return map;
    }
}
