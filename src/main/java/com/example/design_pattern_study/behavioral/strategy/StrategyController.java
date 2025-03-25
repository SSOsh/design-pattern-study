package com.example.design_pattern_study.behavioral.strategy;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/strategy")
public class StrategyController {
    private StrategyService strategyService;

    @GetMapping("/cancellation")
    public String executeCancellationStrategy() {
        return strategyService.useCancellationStrategy();
    }

    @GetMapping("/exchange")
    public String executeExchangeStrategy() {
        return strategyService.useExchangeStrategy();
    }

    @GetMapping("/returning")
    public String executeReturningStrategy() {
        return strategyService.useReturningStrategy();
    }
}
