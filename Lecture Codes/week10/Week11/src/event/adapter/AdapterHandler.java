package event.adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
    	System.out.println("���콺 ��ư Ŭ��");
    }
}
