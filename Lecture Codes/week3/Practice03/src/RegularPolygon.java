public class RegularPolygon {
    private int numOfAngle; // 각의 개수

    public RegularPolygon(int numOfAngle) {
        this.numOfAngle = numOfAngle;
    }

    public int getNumOfAngle() {
        return numOfAngle;
    }

    /**
     * 내각의 합
     */
    public int getSumOfInternalAngles() {
        return (180 * (numOfAngle - 2));
    }

    /**
     * 한 내각의 크기
     */
    public int getInternalAngle() {
        return getSumOfInternalAngles() / numOfAngle;
    }

    /**
     * 한 외각의 크기
     */
    public int getExteriorAngle() {
        return 360 / numOfAngle;
    }
}
