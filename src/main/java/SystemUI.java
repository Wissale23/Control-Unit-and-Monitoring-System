import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class SystemUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Control and monitoring system");
        Temperature temp = new Temperature(0);
        Humidity humidity = new Humidity(0);
        DisplayTempText DisText = new DisplayTempText(temp);
        DisplayHumidityText DisText2 = new DisplayHumidityText(humidity);


        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(3,2));



        frame.add(DisText);
        frame.add(DisText2);


        frame.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.repaint();
            }
        });
        timer.start();


        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
