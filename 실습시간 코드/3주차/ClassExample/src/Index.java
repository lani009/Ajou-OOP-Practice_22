public class Index {
    public static void main(String[] args) {
        Car q3 = new Car("Audi", "Q3", 183, 207);

        Car ioniq5 = new Car("Hyundai", "IONIQ5", 235, 185);

        Car morning = new Car("Kia", "All new Morning", 84, 160);

        Car q3Clone = q3;

        q3Clone.pushGasPedal();
        System.out.println(q3Clone.getCurrentSpeed());

        System.out.println(q3.getCurrentSpeed());
    }
}
