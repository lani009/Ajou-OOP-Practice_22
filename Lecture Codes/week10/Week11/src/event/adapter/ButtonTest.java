package event.adapter;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame {
	public ButtonTest() {
		super("Button Test");
		setSize(500, 500);
		Container pane = getContentPane();
		JButton btn = new JButton("Click me");
		btn.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				((JButton) e.getComponent()).setText("Unpressed");
				e.getComponent().setBackground(Color.RED);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				((JButton) e.getComponent()).setText("Pressed");
				e.getComponent().setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		pane.add(btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		ButtonTest app = new ButtonTest();

	}

}
