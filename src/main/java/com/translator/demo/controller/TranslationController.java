package com.translator.demo.controller;

import com.translator.demo.model.dto.TextForTranslationDto;
import com.translator.demo.model.dto.TextTranslatedDto;
import com.translator.demo.service.TranslationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {
    private final TranslationService translationService;

    public TranslationController(TranslationService translationService) {
        this.translationService = translationService;
    }

    @GetMapping("/")
    public TextTranslatedDto getTranslation() {
        return translationService.getTranslation(new TextForTranslationDto("some text"));
    }
}
