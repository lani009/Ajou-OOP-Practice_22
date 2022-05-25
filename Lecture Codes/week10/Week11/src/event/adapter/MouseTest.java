package event.adapter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseTest extends JFrame {
    public MouseTest() {
        super("mouse adapter");

        JButton btn = new JButton("Click me"); 
        btn.addMouseListener(null);
        add(btn);
    }
}
