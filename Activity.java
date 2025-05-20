import java.util.ArrayList;
import java.util.HashMap;
/**
 * Place holder for activites 
 *
 * 
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
    private Coach coach;
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
        this.coach = coach;
    }
    
    public void getActivitys(){
        this.name = name;
        this.mode = mode;
        this.caloriesBurned = caloriesBurned;
    }
    
    @Override
    public String toString() {
    String coachName = (getCoach() == null) ? "No coach" : getCoach().getFullName();
    String info = name + " - " + mode + " - " + caloriesBurned + " calories (" + coachName + ")";
    
    if (equipment != null) {
        info += " [Powered]";
    }

    return info;
    }
    
    
    public Athlete getAthlete(){
        return athlete;
    }
    
    public String getName(){
        return this.name;
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
    
    public void setCoach(Coach coach) {
    this.coach = coach;
    }
    
    public Coach getCoach() {
    return coach;
    }
    
}