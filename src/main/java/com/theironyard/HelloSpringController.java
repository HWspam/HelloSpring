package com.theironyard;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by erikjakubowski on 12/20/16.
 */
@Controller
public class HelloSpringController {


    @RequestMapping(path = "/person", method = RequestMethod.GET)//handle person route(tell path, method is get)
    public String person(Model model, String name, String city, int age) {//actual method(model sends to html)
        Person p = new Person(name, city, age);
        model.addAttribute("person", p);
        return "person";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)//
    public String home(Model model, HttpSession session) {//Mdele=hashmap
        model.addAttribute("name", session.getAttribute("userName"));
        return "home";
    }
}
