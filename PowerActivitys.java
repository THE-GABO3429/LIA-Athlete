import java.util.HashMap;

/**
 * Write a description of class Mode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowerActivitys
{
    // instance variables - replace the example below with your own
    private HashMap<String, Double> sportsInt = new HashMap<>();
    private Equipment equipment;

    public void addintensityOfSports(String sport, double intensityMulti){
        sportsInt.put(sport, intensityMulti);
    }
    
    public double getMode(String sport){
        if(sportsInt.containsKey(sport)){
            return sportsInt.get(sport);
        }
        else{
            System.out.println("Sport not found.");
            return 0;
        }
    }
    
    public void getSportIntensity(){
        for (String sport : sportsInt.keySet()){
            System.out.println("Sport: " + sport + ", Intensity: " + sportsInt.get(sport));
        } 
    }
    
    private static void activity(String[] args){
        PowerActivitys intensity = new PowerActivitys();
        intensity.addintensityOfSports("swiming" , 2);
        intensity.addintensityOfSports("skating" , 1.3);
        intensity.addintensityOfSports("soccer" , 1.5);
        intensity.addintensityOfSports("swiming" , 1.5);
        intensity.addintensityOfSports("basketball" , 1.3);
        intensity.addintensityOfSports("biking" , 1.3);
        
        intensity.getSportIntensity();
    }
}
