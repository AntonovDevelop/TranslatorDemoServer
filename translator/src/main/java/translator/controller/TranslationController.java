package translator.controller;

import translator.model.dto.TextForTranslationDto;
import translator.model.dto.TextTranslatedDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import translator.service.TranslationService;

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
