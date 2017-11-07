package com.wanglei.web;

import com.wanglei.design.observable.NewObservableTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebSocketController {

    @Autowired
    private NewObservableTest newObservableTest;

    @RequestMapping(value = "/live", method = RequestMethod.GET)
    public String socket(Model model){
        System.out.println("haha1");
        newObservableTest.toUpdate("测试");
        System.out.println("haha2");
     return "live";
    }
}