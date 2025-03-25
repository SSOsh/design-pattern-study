package com.example.design_pattern_study.behavioral.chain_of_responsibility.model;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class HandlerRunner {
    private HandlerFactory handlerFactory;

    List<DefaultHandler> defaultHandlerList;

    @PostConstruct
    private void init() {
        defaultHandlerList = handlerFactory.getDefaultHandlerList();
    }

    public void run(User user) {
        defaultHandlerList.forEach(handler -> {
            try {
                handler.process(user);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
