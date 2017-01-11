package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.models.FormInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    String index() {
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    String welcome(Model model) {
        model.addAttribute("formInfo", new FormInfo());
        return "welcome";
    }

}
