package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by erikjakubowski on 12/20/16.
 */
@RestController //push json
public class HelloSpringJsonController {

    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person jsonHome(String name, String city, int age) {
        return new Person(name,city,age);
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String userName) {//dont need model(need session and username(==queryparams)---getting pulled in
        session.setAttribute("userName", userName);
        return "redirect:/";
    }
}
