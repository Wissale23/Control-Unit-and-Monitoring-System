import javax.swing.*;


public class DisplayTempText extends JPanel  {

    private Temperature temp;

    public DisplayTempText(Temperature temp) {

        JLabel tempText = new JLabel("Temperature sensor: ");
        tempText.setText(
                "<html>"+temp.getWardName() +  "<br>" + "Ideal Temperature: " + temp.getIdealTemp()+
                 "<br>" + "State of heater: "+ temp.getHeatingState() + "</html>");

        add(tempText);

    }



}
