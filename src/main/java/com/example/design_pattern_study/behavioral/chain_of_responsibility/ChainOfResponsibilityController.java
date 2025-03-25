package com.example.design_pattern_study.behavioral.chain_of_responsibility;

import com.example.design_pattern_study.behavioral.chain_of_responsibility.model.HandlerRunner;
import com.example.design_pattern_study.behavioral.chain_of_responsibility.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Controller
@RequestMapping("/chainOfResponsibility")
public class ChainOfResponsibilityController {
    private HandlerRunner handlerRunner;

    @PostMapping("/chaining")
    public String chainOfResponsibility(@RequestBody User user) {
        handlerRunner.run(user);

        return "SUCCESS";
    }
}
