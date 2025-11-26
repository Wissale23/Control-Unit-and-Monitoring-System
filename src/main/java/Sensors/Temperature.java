package Sensors;

import Feeds.EnvironmentalSystem;

public class Temperature {
    private int wardID;
    private EnvironmentalSystem EnvSys;

    public Temperature(int wardID){
        this.wardID = wardID;
        EnvSys= new EnvironmentalSystem();

    }

    public int getWardID() {
        return wardID;
    }

    public float getTemperature(){

        return EnvSys.getTempFeed().getTemperature(wardID); //return here
    }

    public String getWardName(){
        if (wardID == 0){
            return "Ward Name: " + "North Ward";
        }
        if (wardID == 1){
            return "Ward Name: " + "Central Ward";
        }
        if (wardID == 2){
            return "Ward Name: " + "South Ward";
        }

        return "invalid ID";
    }

    public float getIdealTemp(){
        if (wardID == 0){
            return 23 ;
        }
        if (wardID == 1){
            return 22 ;
        }
        if (wardID == 2){
            return 20 ;
        }
        return 0;
    }

    public String getHeatingState(){
        if (EnvSys.isHeatingOn(wardID)){
            return "Heater on";
        }
        else {
            return "Heater off";
        }
    }

}
