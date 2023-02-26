package com.translator.demo.service;

import com.translator.demo.model.dto.TextTranslatedDto;
import com.translator.demo.repository.DictionaryRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TranslationService {
//    private final DictionaryRepository dictionaryRepository;
//
//    public TranslationService(DictionaryRepository dictionaryRepository) {
//        this.dictionaryRepository = dictionaryRepository;
//    }

    public List<TextTranslatedDto> getTranslation() {
        return Arrays.asList(
                new TextTranslatedDto("text 1"),
                new TextTranslatedDto("text 2"),
                new TextTranslatedDto("text 3"),
                new TextTranslatedDto("text 4")
        );
    }
}
