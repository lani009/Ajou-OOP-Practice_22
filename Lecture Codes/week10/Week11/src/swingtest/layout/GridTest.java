package swingtest.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class GridTest extends JFrame {
    public GridTest() {
        setTitle("Grid layout test");
        setSize(500, 500);
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        JButton jb4 = new JButton("Button 4");
        JButton jb5 = new JButton("Button 5");
        JButton jb6 = new JButton("Button 6");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);
        panel.add(jb5);
        panel.add(jb6);
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        GridTest app = new GridTest();
        app.setVisible(true);
        app.setDefaultCloseOperation(GridTest.EXIT_ON_CLOSE);

    }
}
