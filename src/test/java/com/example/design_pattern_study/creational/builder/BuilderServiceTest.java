package com.example.design_pattern_study.creational.builder;

import com.example.design_pattern_study.creational.builder.model.BuilderModel;
import com.example.design_pattern_study.creational.builder.model.ManualBuilderModel;
import lombok.AllArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AllArgsConstructor
class BuilderServiceTest {
    private BuilderService builderService;

    @Test
    public void lombok_builder() {
        //given
        String name = "이름";
                String address = "서울";

        //when
        BuilderModel lombokBuilderModel = builderService.getLombokBuilderModel(name, address);

        //then
        Assertions.assertThat(lombokBuilderModel.getName()).isEqualTo(name);
        Assertions.assertThat(lombokBuilderModel.getAddress()).isEqualTo(address);
    }

    @Test
    public void manual_builder() throws Exception {
        //given
        String name = "이름";
        String address = "서울";
        //when
        ManualBuilderModel manualBuilderModel = builderService.getManualBuilderModel(name, address);
        //then
        Assertions.assertThat(manualBuilderModel.getName()).isEqualTo(name);
        Assertions.assertThat(manualBuilderModel.getAddress()).isEqualTo(address);
    }
}