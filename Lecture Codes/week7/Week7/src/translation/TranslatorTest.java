package translation;

public class TranslatorTest {
    public static void main(String[] args) {
        EnglishTranslator eng = new EnglishTranslator();
        JapaneseTranslator jap = new JapaneseTranslator();

        System.out.println(eng.translate("안녕하세요!"));
        System.out.println(jap.translate("안녕하세요!"));

    }
}
