package com.example.design_pattern_study.behavioral.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StrategyEnum {
    CANCELLATION("cancellationStrategy"),
    EXCHANGE("exchangeStrategy"),
    RETURNING("returningStrategy");

    private String strategyName;
}
