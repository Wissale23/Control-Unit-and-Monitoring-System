package Texts;

import Sensors.Temperature;

import javax.swing.*;


public class DisplayTempText extends JPanel  {

    private Temperature temp;

    public DisplayTempText(Temperature temp) {

        JLabel tempText = new JLabel("Temperature sensor: ");
        this.temp=temp;
        tempText.setText(
                "<html>"+temp.getWardName() +  "<br>" + "Current temperature: " +String.valueOf(temp.getTemperature())+
                        "<br>"+"Ideal sensor Temperature: " + temp.getIdealTemp()+
                 "<br>" + "State of heater: "+ temp.getHeatingState() + "</html>");

        add(tempText);

    }

    public String getText(){
        return  temp.getWardName() +"\n"+ "Current temperature: " +String.valueOf(temp.getTemperature())+"\n"+
                "Ideal sensor Temperature: " + temp.getIdealTemp()+"\n"+  "State of heater: "+ temp.getHeatingState();
    }
}
