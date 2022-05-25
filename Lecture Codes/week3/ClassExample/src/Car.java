public class Car {
    String manufacturer; // 제조사
    String modelName; // 자동차 모델명
    int horsePower; // 마력
    int maxSpeed; // 최대 속도
    int currentSpeed; // 현재 속도

    public Car(String manufacturer, String modelName, int horsePower, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    /**
     * 악셀 밟기
     */
    public void pushGasPedal() {
        currentSpeed += horsePower;
    }

    /**
     * 현재 속도 받기
     * 
     * @return 현재 속도
     */
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
