package swingtest.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class GridProblem extends JFrame {
    public GridProblem() {
        setTitle("Grid layout test");
        setSize(500, 500);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        GridProblem app = new GridProblem();
        app.setVisible(true);
        app.setDefaultCloseOperation(GridProblem.EXIT_ON_CLOSE);

    }
}
