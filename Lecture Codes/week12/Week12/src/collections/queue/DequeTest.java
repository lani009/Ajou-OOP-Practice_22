package collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deck = new LinkedList<>();

        deck.add("Student1");
        deck.addFirst("Student2");
        deck.addLast("Student3");

        System.out.println(deck.pollFirst());
        System.out.println(deck.pollLast());
    }
}
