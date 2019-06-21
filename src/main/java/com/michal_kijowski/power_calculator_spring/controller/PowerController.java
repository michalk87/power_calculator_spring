package com.michal_kijowski.power_calculator_spring.controller;

import com.michal_kijowski.power_calculator_spring.model.Device;
import com.michal_kijowski.power_calculator_spring.service.PriceCalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PowerController {

    @Autowired
    PriceCalculateService calculateService;

    @GetMapping("/device")
    public String greetingForm(Model model) {
        model.addAttribute("device", new Device());
        return "greeting";
    }

    @PostMapping("/device")
    public String greetingSubmit(@ModelAttribute Device device) {
        calculateService.calculatePrice(device);
        return "result";
    }
}
