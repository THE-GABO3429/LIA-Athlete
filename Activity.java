import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Actitvity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity
{
    // instance variables - replace the example below with your own
    
    //+ intensity : Double
    //+ Details : String
    //+ Distance : Int
    //+ listAthletesByActivitys : HashMap
    //+ listAllModes
    //+ totalCaloriesBurntInActivity : Int
    private String name;
    private String mode;
    private int caloriesBurned;
    private Athlete athlete;
    private Equipment equipment;
    private double distance;
    /**
     * Constructor for objects of class Actitvity
     */
    public Activity(String name, String mode, int calories, Athlete athlete, Equipment equipment, double distance)
    {
        this.name = name;
        this.mode = mode;
        this.caloriesBurned = calories;
        this.athlete = athlete;
        this.equipment = equipment;
        this.distance = distance;
    }
    
    public void getActivitys(){
        this.name = name;
        this.mode = mode;
        this.caloriesBurned = caloriesBurned;
    }
    
    @Override
    public String toString() {
    String equipText = (equipment != null) ? " (using " + equipment.toString() + ")" : "";
    return name + " - " + mode + " - " + caloriesBurned + " calories - " + distance + " km" + equipText;
    }
    
    public Athlete getAthlete(){
        return athlete;
    }
    
    public String getMode() {
    return mode;
    }
    
    public double getDistance() {
    return distance;
    }
    
    public int getCaloriesBurned() {
    return caloriesBurned;
    }
    
    public Equipment getEquipment() {
    return this.equipment;
    }
}