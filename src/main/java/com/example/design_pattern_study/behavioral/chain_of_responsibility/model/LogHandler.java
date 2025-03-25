package com.example.design_pattern_study.behavioral.chain_of_responsibility.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class LogHandler extends DefaultHandler {

    @Override
    void process(User user) {
        log.info("start LogHandler");
        log.info("end LogHandler");
    }
}
