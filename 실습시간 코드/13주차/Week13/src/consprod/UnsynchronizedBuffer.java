package consprod;

public class UnsynchronizedBuffer implements Buffer {
    private int value = -1;

    @Override
    public int get() {
        return value;
    }

    @Override
    public void put(int value) {
        this.value = value;
    }

}
