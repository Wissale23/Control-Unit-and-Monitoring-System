
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class SystemUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Control and monitoring system");
        SystemPanel systemPanel = new SystemPanel();

        frame.setSize(500, 300);
        frame.add(systemPanel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        Timer timer1 = new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Timer timer2 = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.repaint();
                    }
                });
                timer2.start();

            }
        });
        timer1.start();
    }
}
