package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.services.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */

@Controller
public class ThankYouController {

    private ProjectRepository projectRepository;

    @Autowired
    public ThankYouController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @RequestMapping(value = "/thankyou")
    String thankyou(Model model) {
        model.addAttribute("projects", projectRepository.findAll());

        return "thankyou";
    }

}
