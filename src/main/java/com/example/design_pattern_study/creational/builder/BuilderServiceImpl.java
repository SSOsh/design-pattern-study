package com.example.design_pattern_study.creational.builder;

import com.example.design_pattern_study.creational.builder.model.BuilderModel;
import com.example.design_pattern_study.creational.builder.model.ManualBuilderModel;
import org.springframework.stereotype.Service;

@Service
public class BuilderServiceImpl implements BuilderService {
    @Override
    public BuilderModel getLombokBuilderModel(String name, String address) {
        return BuilderModel.builder()
                .name(name)
                .address(address)
                .build();
    }

    @Override
    public ManualBuilderModel getManualBuilderModel(String name, String address) {
        return ManualBuilderModel.builder()
                .name(name)
                .address(address)
                .build();
    }
}
