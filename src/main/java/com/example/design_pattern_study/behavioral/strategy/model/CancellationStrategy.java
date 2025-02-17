package com.example.design_pattern_study.behavioral.strategy.model;

import org.springframework.stereotype.Component;

@Component
public class CancellationStrategy implements ClaimStrategy {

    @Override
    public String getName() {
        return getClass().getName();
    }

    @Override
    public String claimProcess() {
        return "cancellation complete";
    }
}
