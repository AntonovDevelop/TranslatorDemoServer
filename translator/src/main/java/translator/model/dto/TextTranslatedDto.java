package translator.model.dto;

public class TextTranslatedDto {
    public String text;

    public TextTranslatedDto(String text) {
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
        return "TextTranslatedDto{" +
                "text='" + text + '\'' +
                '}';
    }
}
