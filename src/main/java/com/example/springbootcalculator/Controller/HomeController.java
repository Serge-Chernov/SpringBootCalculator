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
    public String calc(Model model) {
        model.addAttribute("newOp", new Operation());
        return "calculator";
    }
    @PostMapping("/calc")
    public String calc(@ModelAttribute("newOp") @Valid Operation operation, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "calculator";
        }
        System.out.println(operation);
        return "calculator";
    }
}
