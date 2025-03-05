package com.example.design_pattern_study.behavioral.chain_of_responsibility.model;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Handler")
@Slf4j
public abstract class DefaultHandler {
    abstract void process(User user) throws Exception;
}
