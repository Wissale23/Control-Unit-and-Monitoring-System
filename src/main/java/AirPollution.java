import Feeds.EnvironmentalSystem;

public class AirPollution {
    private int wardID;
    private EnvironmentalSystem EnvSys;


    public AirPollution( int wardID){
        this.wardID = wardID;
        EnvironmentalSystem EnvSys = new EnvironmentalSystem();

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
