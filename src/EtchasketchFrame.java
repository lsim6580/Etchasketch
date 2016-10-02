import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luke on 10/1/2016.
 */
public class EtchasketchFrame extends JFrame{
    public EtchasketchFrame() {
        setTitle("Etchasketch");
        setSize(600, 400);
        JButton clear = new JButton("Clear");

        Container contentPane = getContentPane();
        EtchasketchScreen etchasketchScreen = new EtchasketchScreen();
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etchasketchScreen.clear();
                contentPane.repaint();
            }
        });
        contentPane.add(etchasketchScreen, BorderLayout.CENTER);
        contentPane.add(clear, BorderLayout.SOUTH);
    }

    public static void main(String []args){
        JFrame frame = new EtchasketchFrame();
        // The window size is set in the constructor for DrawFrame
        frame.setVisible(true);
    }
}


