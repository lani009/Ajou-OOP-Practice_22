package data;

public enum ServerType {
    KOREA("Korea"),
    JAPAN("Japan"),
    EUROPE("Europe"),
    NORTH_AMERICA("NorthAmerica");

    private final String textName;

    private ServerType(String textName) {
        this.textName = textName;
    }

    public static ServerType valueOfTextName(String textName) {
        for (var e : values()) {
            if (e.textName.equals(textName)) {
                return e;
            }
        }
        throw new RuntimeException(String.format("일치하는 TextName: %s이 없습니다.", textName));
    }
}
