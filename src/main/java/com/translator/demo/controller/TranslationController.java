package com.translator.demo.controller;

import com.translator.demo.model.dto.StatisticsDto;
import com.translator.demo.model.dto.TextTranslatedDto;
import com.translator.demo.service.TranslationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TranslationController {
    private final TranslationService translationService;

    public TranslationController(TranslationService translationService) {
        this.translationService = translationService;
    }

    @GetMapping("/")
    public List<TextTranslatedDto> getTranslation() {
        return translationService.getTranslation();
    }
}
