package translator.service;

import translator.model.dto.TextForTranslationDto;
import translator.model.dto.TextTranslatedDto;
import translator.repository.DictionaryRepository;
import translator.repository.FileDictionaryRepository;
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
