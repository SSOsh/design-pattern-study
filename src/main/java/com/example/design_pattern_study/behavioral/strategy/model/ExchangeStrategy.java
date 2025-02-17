package com.example.design_pattern_study.behavioral.strategy.model;

import org.springframework.stereotype.Component;

@Component
public class ExchangeStrategy implements ClaimStrategy {
    @Override
    public String getName() {
        return ClaimStrategy.super.getName();
    }

    @Override
    public String claimProcess() {
        return "exchange complete";
    }
}
