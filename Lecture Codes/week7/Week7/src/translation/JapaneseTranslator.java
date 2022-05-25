package translation;

public class JapaneseTranslator implements Translatable {
    @Override
    public String translate(String korean) {
        return "일본어로 번역된 문장";
    }

    @Override
    public String inverseTranslate(String japanese) {
        return "한국어로 번역된 문장";
    }
}
