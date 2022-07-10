package hw10;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Assignment extends JFrame {
	public Assignment() {
		super("Counter program");
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		List<JButton> btnList = new ArrayList<>();
		btnList.add(new JButton("0"));
		btnList.add(new JButton("0"));
		btnList.add(new JButton("0"));
		btnList.add(new JButton("0"));

		Container pane = getContentPane();

		pane.setLayout(new GridLayout(2, 2));

		MouseAdapter buttonEvent = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton btn = ((JButton) e.getComponent());
				if (e.getButton() == MouseEvent.BUTTON1) {
					btn.setText(String.valueOf(Integer.parseInt(btn.getText()) + 1));
				} else if (e.getButton() == MouseEvent.BUTTON3) {
					btn.setText(String.valueOf(Integer.parseInt(btn.getText()) - 1));
				}
				if (Integer.parseInt(btn.getText()) % 10 == 0) {
					btn.setBackground(Color.GREEN);
				} else {
					btn.setBackground(Color.WHITE);
				}
			}
		};

		for (JButton btn : btnList) {
			btn.addMouseListener(buttonEvent);
			pane.add(btn);
		}
	}

	public static void main(String[] args) {
		Assignment app = new Assignment();
	}
}
