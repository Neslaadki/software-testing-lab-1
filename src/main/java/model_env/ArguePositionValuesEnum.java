package model_env;

public enum ArguePositionValuesEnum {
    IN_GAMING("В_ИГРЕ"), IN_SLEEPING("ВО_СНЕ"), IN_EATING("В_ЕДЕ");

    private String russianName;

    ArguePositionValuesEnum(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }
}




