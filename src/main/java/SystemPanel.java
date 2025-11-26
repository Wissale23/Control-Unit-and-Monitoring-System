import Sensors.AirPollution;
import Sensors.Humidity;
import Sensors.Temperature;
import Texts.DisplayAirPollutionText;
import Texts.DisplayHumidityText;
import Texts.DisplayTempText;

import javax.swing.*;
import java.awt.*;

public class SystemPanel extends JPanel {


    public SystemPanel(){

        setLayout(null);
        setSize(500,300);
        setLayout(new GridLayout(3, 2));

        Temperature[] tempSensors = { // multiple temperature sensors
                new Temperature(0),
                new Temperature(1),
                new Temperature(2)
        };

        Humidity humidity = new Humidity();
        AirPollution airPollution = new AirPollution();

        Monitoring monitoring = new Monitoring();

        DisplayTempText[] tempDisplays = new DisplayTempText[tempSensors.length];
        DisplayHumidityText DisHum = new DisplayHumidityText(humidity);
        DisplayAirPollutionText DisPoll= new DisplayAirPollutionText(airPollution);


        for (int i = 0; i < tempSensors.length; i++) {
            tempDisplays[i] = new DisplayTempText(tempSensors[i]);
            tempDisplays[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(tempDisplays[i]);
        }

        DisHum.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        DisPoll.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(DisHum);
        add(DisPoll);


        for (int i = 0; i < tempSensors.length; i++) {
            if (monitoring.isTempOutOfRange(tempSensors[i])) {
                tempDisplays[i].setBackground(Color.RED);
            }
        }

        if (monitoring.isHumOutOfRange(humidity)){
            DisHum.setBackground(Color.RED);
        }

        if (monitoring.isPollOutOfRange(airPollution)){
            DisPoll.setBackground(Color.RED);
        }

    }


}
