package com.example.design_pattern_study.creational.builder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ManualBuilderModel {
    private String name;
    private String address;

    public static ManualBuilderModelBuilder builder() {
        return new ManualBuilderModelBuilder();
    }

    public static class ManualBuilderModelBuilder {
        private String name;
        private String address;

        public ManualBuilderModelBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ManualBuilderModelBuilder address(String address) {
            this.address = address;
            return this;
        }

        public ManualBuilderModel build() {
            return new ManualBuilderModel(this.name, this.address);
        }
    }
}
