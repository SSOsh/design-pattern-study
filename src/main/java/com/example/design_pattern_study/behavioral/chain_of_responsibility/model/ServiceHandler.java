package com.example.design_pattern_study.behavioral.chain_of_responsibility.model;

import com.example.design_pattern_study.behavioral.chain_of_responsibility.ChainOfResponsibilityService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class ServiceHandler extends DefaultHandler{
    private ChainOfResponsibilityService chainOfResponsibilityService;
    @Override
    void process(User user) {
        log.info("start ServiceHandler");
        chainOfResponsibilityService.process(user);
        log.info("start ServiceHandler");
    }
}
