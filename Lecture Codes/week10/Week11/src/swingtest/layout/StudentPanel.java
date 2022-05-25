package swingtest.layout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * 학생을 표시하기 위한 패널
 * @author s
 *
 */
public class StudentPanel extends JPanel {
	/**
	 * 학번
	 */
    private String id;
    /**
     * 이름
     */
    private String name;

    /**
     * 이 생성자는 ~~~하는 생성자다
     * @param id 학번을 입력한다
     * @param name 이름을 입력한다.
     */
    public StudentPanel(String id, String name) {
        this.id = id;
        this.name = name;

        setLayout(new GridLayout(2, 1));
        add(new JLabel(id));
        add(new JLabel(name));
    }
}
