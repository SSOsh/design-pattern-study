package com.example.design_pattern_study.behavioral.strategy;

import lombok.AllArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AllArgsConstructor
class StrategyServiceTest {
    private StrategyService strategyService;

    @Test
    void 취소_service_test() {
        //given

        //when
        String cancellationResult = strategyService.useCancellationStrategy();
        //then
        Assertions.assertThat(cancellationResult).isEqualTo("cancellation complete");
    }

    @Test
    void 교환_service_test() {
        //given

        //when
        String exchangeResult = strategyService.useExchangeStrategy();
        //then
        Assertions.assertThat(exchangeResult).isEqualTo("exchange complete");
    }

    @Test
    void 반품_service_test() {
        //given

        //when
        String returningResult = strategyService.useReturningStrategy();
        //then
        Assertions.assertThat(returningResult).isEqualTo("returning complete");
    }
}