package event.button;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Beep extends JFrame {
    public Beep() {
        super("Beep Button Program");

        setSize(300, 300);

        JButton beepButton = new JButton();
        beepButton.setText("Beep");
        beepButton.addMouseListener(new BeepListener());
        add(beepButton);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Beep beep = new Beep();
    }
}
