package problem;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PhoneNumber extends JFrame {
	public PhoneNumber() {
		super("Phone Number test");
		setSize(300, 300);
		JTextField numberField = new JTextField();
		
		numberField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() < '0' || e.getKeyChar() > '9') {
					e.consume();
				}
			}
		});
		
		Container pane = getContentPane();
		pane.add(numberField);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		PhoneNumber app = new PhoneNumber();
	}
}
