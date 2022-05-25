package swing.border;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderTest extends JFrame {
	public BorderTest() {
		super("Border Layout Test");
		setSize(500, 500);
		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("South");
		JButton btn3 = new JButton("West");
		JButton btn4 = new JButton("East");
		JButton btn5 = new JButton("Center");
		
		btn3.setSize(100, 50);
		
		Container pane = getContentPane();
		BorderLayout layout = new BorderLayout();
		layout.setHgap(50);
		layout.setVgap(50);
		pane.setLayout(layout);
		pane.add(btn1, BorderLayout.NORTH);
		pane.add(btn2, BorderLayout.SOUTH);
		pane.add(btn3, BorderLayout.WEST);
		pane.add(btn4, BorderLayout.EAST);
		pane.add(btn5, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BorderTest app = new BorderTest();
	}
}
