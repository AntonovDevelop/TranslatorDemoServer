package com.translator.demo.model.dto;

import java.util.List;

public class TextForTranslationDto {
    public String text;

    public List<String> unclearWords;

    public TextForTranslationDto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextForTranslationDto{" +
                "text='" + text + '\'' +
                '}';
    }
}
