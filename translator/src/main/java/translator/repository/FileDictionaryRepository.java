package translator.repository;

public class FileDictionaryRepository implements DictionaryRepository {

    @Override
    public String getTranslation(String text) {
        return "translation from dictionary file";
    }
}
