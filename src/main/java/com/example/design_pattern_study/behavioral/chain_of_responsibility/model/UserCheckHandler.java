package com.example.design_pattern_study.behavioral.chain_of_responsibility.model;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Slf4j
public class UserCheckHandler extends DefaultHandler{
    @Override
    void process(User user) throws Exception {
        log.info("start UserCheckHandler");
        if(Strings.isBlank(user.getId())) {
            throw new Exception("ID가 비었습니다");
        }

        if(Strings.isBlank(user.getName())) {
            throw new Exception("name이 비었습니다");
        }
        log.info("end UserCheckHandler");
    }
}
