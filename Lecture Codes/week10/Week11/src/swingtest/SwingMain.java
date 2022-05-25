package swingtest;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;

public class SwingMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame();	// â ����
        frame.setTitle("This is test");	// Ÿ��Ʋ
        frame.setSize(300, 300);	// ũ��
        frame.setVisible(true);	// â�� ���̳� �Ⱥ��̳�

        Container pane = frame.getContentPane();
        pane.add(new JButton("Button A"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
