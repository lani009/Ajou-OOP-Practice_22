package swingtest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;

public class SwingTest extends JFrame {
    public SwingTest() {
        setTitle("This is test");
        setSize(300, 300);
        setVisible(true);
        
//        add(new JLabel("This is Label"));
        
        Container pane = getContentPane();
//        pane.add(new JButton("Button1"));

//        Container pane = getContentPane();
        pane.add(new JButton("Button A"));
    }

    public static void main(String[] args) {
        SwingTest frame = new SwingTest();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
