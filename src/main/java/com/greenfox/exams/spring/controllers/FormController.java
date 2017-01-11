package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.models.FormInfo;
import com.greenfox.exams.spring.services.FormInfoRepository;
import com.greenfox.exams.spring.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */

@Controller
public class FormController {

    private FormInfoRepository formInfoRepository;
    private FormService formService;


    @Autowired
    public FormController(FormInfoRepository formInfoRepository, FormService formService) {
        this.formInfoRepository = formInfoRepository;
        this.formService = formService;
    }


    @PostMapping(value = "/welcome")
    String post(Model model, @ModelAttribute @Valid FormInfo formInfo, BindingResult bindingResult) {
        boolean customValid = !formService.validate(formInfo.getText());
        if (bindingResult.hasErrors() || customValid) {
            model.addAttribute("customValid", customValid);
            return "welcome";
        }
        formInfoRepository.save(formInfo);
        return "redirect:/thankyou";
    }
}
