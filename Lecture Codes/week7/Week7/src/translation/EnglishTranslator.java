package translation;

public class EnglishTranslator implements Translatable {
    @Override
    public String translate(String korean) {
        return "영어로 번역된 문장";
    }

    @Override
    public String inverseTranslate(String english) {
        return "한국어로 번역된 문장";
    }
}
