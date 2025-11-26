package Sensors;

import Feeds.EnvironmentalSystem;

public class Humidity {

    private EnvironmentalSystem EnvSys;

    public Humidity(){
        EnvSys = new EnvironmentalSystem();
    }

    public int getInsideHum(){
        return EnvSys.getHumidityFeed().getInsideHumidity();
    }

    public int getOutsideHum(){
        return EnvSys.getHumidityFeed().getOutsideHumidity();
    }

    public int getHumDiff(){
        return getOutsideHum() - getInsideHum();
    }

    public String getHumState(){
        if (EnvSys.isDehumudifierOn()){
            return "Dehumidifier On";
        }
        else {
            return "Dehumidifier Off";
        }

    }

}
