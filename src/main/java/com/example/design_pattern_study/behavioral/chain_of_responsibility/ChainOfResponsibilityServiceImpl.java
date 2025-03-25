package com.example.design_pattern_study.behavioral.chain_of_responsibility;

import com.example.design_pattern_study.behavioral.chain_of_responsibility.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChainOfResponsibilityServiceImpl implements ChainOfResponsibilityService {
    @Override
    public String process(User user) {
        log.info("start ChainOfResponsibilityServiceImpl");
        log.info("end ChainOfResponsibilityServiceImpl");
        return "SUCCESS";
    }
}
