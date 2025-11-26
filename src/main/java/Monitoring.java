import Sensors.AirPollution;
import Sensors.Humidity;
import Sensors.Temperature;

public class Monitoring {

    private Temperature temperature;
    private Humidity humidity;
    private AirPollution airPollution;




    public boolean isTempOutOfRange(Temperature temperature){
        if (temperature.getTemperature()< temperature.getIdealTemp()+ 0.5 & temperature.getTemperature()> temperature.getIdealTemp()- 0.5 ){
            return false;
        }
        else{
            return true;
        }
    }


    public boolean isHumOutOfRange(Humidity humidity){
        if (humidity.getInsideHum()>0.1* humidity.getOutsideHum()){
            return true;
        }

        else{
            return false;
        }
    }

    public boolean isPollOutOfRange( AirPollution airPollution){
        if (airPollution.getPollevel()>5){
            return true;
        }
        else{
            return false;
        }
    }

}
