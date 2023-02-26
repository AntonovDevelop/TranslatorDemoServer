package com.translator.demo.service;

import com.translator.demo.model.dto.TextForTranslationDto;
import com.translator.demo.model.dto.TextTranslatedDto;
import com.translator.demo.repository.DictionaryRepository;
import com.translator.demo.repository.FileDictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {
    private final DictionaryRepository dictionaryRepository;

    public TranslationService() {
        this.dictionaryRepository = new FileDictionaryRepository();
    }

    public TextTranslatedDto getTranslation(TextForTranslationDto text) {
        //работа с текстом и получение статистики
        return new TextTranslatedDto(dictionaryRepository.getTranslation(text.getText()));
    }
}
