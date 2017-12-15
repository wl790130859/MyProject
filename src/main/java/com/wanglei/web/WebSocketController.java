package com.wanglei.web;

import com.wanglei.design.observable.NewObservableTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebSocketController {

    @Autowired
    private NewObservableTest newObservableTest;
    private static int i = 0;

    @RequestMapping(value = "/live", method = RequestMethod.GET)
    public String socket(Model model, HttpServletRequest request) {
//        System.out.println("haha1");
//        newObservableTest.toUpdate("测试");
//        System.out.println("haha2");
        String username = "zhangsan_" + i;
        request.getSession().setAttribute("session_user_agent", username);
        i++;
        model.addAttribute("user", username);
        return "live";
    }

}