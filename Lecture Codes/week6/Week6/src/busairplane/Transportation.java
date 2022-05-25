package busairplane;

import java.util.ArrayList;
import java.util.List;

public class Transportation {
    protected List<Person> pessengerList = new ArrayList<>();
    protected String transportationName;

    public Transportation(String transportationName) {
        this.transportationName = transportationName;
    }
    
    public void ride(Person pessenger) {
        pessengerList.add(pessenger);
    }

    public void move(int x, int y) {
        System.out.printf("%d, %d로 이동!", x, y);
    }
}
