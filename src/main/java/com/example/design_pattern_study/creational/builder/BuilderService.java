package com.example.design_pattern_study.creational.builder;

import com.example.design_pattern_study.creational.builder.model.BuilderModel;
import com.example.design_pattern_study.creational.builder.model.ManualBuilderModel;

public interface BuilderService {
    BuilderModel getLombokBuilderModel(String name, String address);

    ManualBuilderModel getManualBuilderModel(String name, String address);
}
