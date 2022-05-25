package event.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BeepListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("마우스 누르지 마라");
        System.out.println(e.getX());
        System.out.println(e.getY());
    }
    
}
