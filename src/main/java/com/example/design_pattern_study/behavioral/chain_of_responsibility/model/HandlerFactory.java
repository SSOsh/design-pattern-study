package com.example.design_pattern_study.behavioral.chain_of_responsibility.model;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class HandlerFactory {
    private ApplicationContext applicationContext;

    public List<DefaultHandler> getDefaultHandlerList() {
        return new ArrayList<>(applicationContext.getBeansOfType(DefaultHandler.class)
                .values());
    }
}
