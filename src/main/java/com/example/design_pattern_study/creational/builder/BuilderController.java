package com.example.design_pattern_study.creational.builder;

import com.example.design_pattern_study.creational.builder.model.BuilderModel;
import com.example.design_pattern_study.creational.builder.model.ManualBuilderModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/builder")
public class BuilderController {
    private BuilderService builderService;

    @GetMapping("/lombok")
    public BuilderModel getLombokBuilderModel(@RequestParam("name") String name,
                                              @RequestParam("address") String address) {
        return builderService.getLombokBuilderModel(name, address);
    }

    @GetMapping("/manual")
    public ManualBuilderModel getManualBuilderModel(@RequestParam("name") String name,
                                                    @RequestParam("address") String address) {
        return builderService.getManualBuilderModel(name, address);
    }
}
