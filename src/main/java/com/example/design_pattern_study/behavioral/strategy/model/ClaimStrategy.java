package com.example.design_pattern_study.behavioral.strategy.model;

public interface ClaimStrategy {
    default String getName() {
        return getClass().getName();
    }

    String claimProcess();
}
