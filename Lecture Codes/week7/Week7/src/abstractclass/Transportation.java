package abstractclass;

import java.util.ArrayList;
import java.util.List;

public abstract class Transportation {
    private List<Person> pessengerList = new ArrayList<>();

    public void ride(Person pessenger) {
        this.pessengerList.add(pessenger);
    }

    public abstract void move(int x, int y);
}
