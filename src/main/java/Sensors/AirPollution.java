package Sensors;

import Feeds.EnvironmentalSystem;

public class AirPollution {
    private EnvironmentalSystem EnvSys;


    public AirPollution( ){

        EnvSys = new EnvironmentalSystem();

    }

    public float getPollevel(){
        return EnvSys.getPollutionFeed().getPollution();
    }
    public String getPurifier(){
        if(EnvSys.isAirPurifierOn()){
            return "Purifier On";
        }

        else{
            return "Purifier Off";
        }
    }
}
