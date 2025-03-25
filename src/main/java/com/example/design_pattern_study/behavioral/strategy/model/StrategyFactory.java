package com.example.design_pattern_study.behavioral.strategy.model;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@AllArgsConstructor
@Slf4j
public class StrategyFactory {
    private ApplicationContext context;
    private Map<String, ClaimStrategy> strategyMap;

    @PostConstruct
    public void init() {
        strategyMap = context.getBeansOfType(ClaimStrategy.class);
    }

    public ClaimStrategy getClaimStrategy(StrategyEnum strategyEnum) {
        return strategyMap.get(strategyEnum.getStrategyName());
    }
}
