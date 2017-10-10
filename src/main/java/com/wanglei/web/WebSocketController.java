package com.wanglei.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebSocketController {

    @RequestMapping(value = "/live", method = RequestMethod.GET)
    public String socket(Model model){
     return "live";
    }
}