package com.example.springbootcalculator.Controller;

import com.example.springbootcalculator.Entity.Operation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/calc")
    public ModelAndView calc(ModelAndView modelAndView) {
        modelAndView.setViewName("newOp");
        modelAndView.addObject(new Operation());
        return modelAndView;
    }
    @PostMapping("/calc")
    public String calc(@ModelAttribute("newOp") @Valid Operation operation, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "calculator";
        }
        System.out.println(operation);
        return "calculator";
    }
}
