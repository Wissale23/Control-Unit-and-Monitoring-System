package Texts;

import Sensors.Humidity;

import javax.swing.*;

public class DisplayHumidityText extends JPanel {

    private Humidity humid;

    public DisplayHumidityText(Humidity humid) {

        JLabel humidText = new JLabel("Sensors.Humidity sensor: ");
        humidText.setText(
                "<html>" + "Inside Humidity: " + String.valueOf(humid.getInsideHum()) + "<br>" + "Outside Humidity: " +
                        String.valueOf(humid.getOutsideHum()) + "<br>" + "Difference: " +
                        String.valueOf(humid.getHumDiff()) + "<br>" + "State of dehumidifier: " +
                        humid.getHumState() + "</html>");
        add(humidText);
    }
}