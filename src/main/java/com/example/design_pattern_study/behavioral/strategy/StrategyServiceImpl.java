package com.example.design_pattern_study.behavioral.strategy;

import com.example.design_pattern_study.behavioral.strategy.model.ClaimStrategy;
import com.example.design_pattern_study.behavioral.strategy.model.StrategyEnum;
import com.example.design_pattern_study.behavioral.strategy.model.StrategyFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyServiceImpl implements StrategyService {
    private StrategyFactory strategyFactory;

    public String useCancellationStrategy() {
        StrategyEnum cancellatinoStrategyEnum = StrategyEnum.CANCELLATION;
        ClaimStrategy claimStrategy = strategyFactory.getClaimStrategy(cancellatinoStrategyEnum);

        return claimStrategy.claimProcess();
    }

    public String useExchangeStrategy() {
        StrategyEnum cancellatinoStrategyEnum = StrategyEnum.EXCHANGE;
        ClaimStrategy claimStrategy = strategyFactory.getClaimStrategy(cancellatinoStrategyEnum);

        return claimStrategy.claimProcess();
    }

    public String useReturningStrategy() {
        StrategyEnum cancellatinoStrategyEnum = StrategyEnum.RETURNING;
        ClaimStrategy claimStrategy = strategyFactory.getClaimStrategy(cancellatinoStrategyEnum);

        return claimStrategy.claimProcess();
    }

}
