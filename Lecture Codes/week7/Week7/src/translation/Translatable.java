package translation;

public interface Translatable {
    /**
     * 한국어를 외국어로 변환
     * @param korean 한국어 문장
     * @return 번역된 외국어 문장
     */
    public String translate(String korean);

    /**
     * 외국어를 한국어로 변환
     * @param foreignLang 외국어 문장
     * @return 번역된 한국어 문장
     */
    public String inverseTranslate(String foreignLang);
}
