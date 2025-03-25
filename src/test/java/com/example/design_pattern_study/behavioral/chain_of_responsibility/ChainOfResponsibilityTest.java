package com.example.design_pattern_study.behavioral.chain_of_responsibility;

import com.example.design_pattern_study.behavioral.chain_of_responsibility.model.User;
import lombok.AllArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ChainOfResponsibilityTest {
    private final ChainOfResponsibilityController chainOfResponsibilityController;

    @Autowired
    public ChainOfResponsibilityTest(ChainOfResponsibilityController chainOfResponsibilityController) {
        this.chainOfResponsibilityController = chainOfResponsibilityController;
    }


    @Test
    void 정상_service_test() {
        User user = new User("123", "123");
        Assertions.assertThat(chainOfResponsibilityController.chainOfResponsibility(user)).isEqualTo("SUCCESS");
    }

    @Test
    void no_name_service_test() {
        User user = new User(null, "123");
        Assertions.assertThatThrownBy(() -> chainOfResponsibilityController.chainOfResponsibility(user)).isInstanceOf(Exception.class);
    }

    @Test
    void no_id_service_test() {
        User user = new User("123", null);
        Assertions.assertThatThrownBy(() -> chainOfResponsibilityController.chainOfResponsibility(user)).isInstanceOf(Exception.class);
    }
}