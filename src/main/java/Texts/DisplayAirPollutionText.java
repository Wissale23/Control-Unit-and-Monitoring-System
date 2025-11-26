package Texts;

import Sensors.AirPollution;

import javax.swing.*;
import java.awt.*;

public class DisplayAirPollutionText extends JPanel{

    private AirPollution airPollution;

    public DisplayAirPollutionText(AirPollution airPollution) {

        JLabel pollutionText = new JLabel("Air Pollution sensor: ");

        pollutionText.setText("<html>" + "Air Pollution sensor: "+ "</html>");
        pollutionText.setText(
                "<html>" + "Current pollution level: " + String.valueOf(airPollution.getPollevel()) + "<br>" + "State of purifier: " +
                airPollution.getPurifier() + "</html>");



        add(pollutionText);

    }
}