import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by luke on 10/2/2016.
 */
public class ProjectB extends JFrame{
    ProjectB() {
        Container contentPane = getContentPane();
        JButton button = new JButton("Push ME");
        JPanel jPanel = new JPanel();
        jPanel.add(button);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setEnabled(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setEnabled(true);
            }
        });
        contentPane.add(jPanel, BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        JFrame frame = new ProjectB();
        frame.pack();
        frame.setVisible(true);
    }


}
