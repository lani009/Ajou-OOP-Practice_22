package swingtest.layout;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.rmi.StubNotFoundException;

public class StudentTest extends JFrame {
    public StudentTest() {
        setTitle("Student Test");
        setSize(600, 300);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(30);
        setLayout(layout);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        var a = new BorderLayout();
    }


    public static void main(String[] args) {
        StudentTest frame = new StudentTest();

        frame.add(new StudentPanel("20192222", "Jung"));
        frame.add(new StudentPanel("20201657", "Yong"));
        frame.add(new StudentPanel("20221334", "Lee"));
        frame.add(new StudentPanel("20151038", "Park"));
    }
}
