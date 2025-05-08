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
    private PowerActivitys power;
    private ModePhysical pyshical;
    //+ intensity : Double
    //+ Details : String
    //+ Distance : Int
    //+ listAthletesByActivitys : HashMap
    //+ listAllModes
    //+ totalCaloriesBurntInActivity : Int
    private String name;
    private String mode;
    private int caloriesBurned;
    /**
     * Constructor for objects of class Actitvity
     */
    public Activity(String name, String mode, int calories)
    {
        this.name = name;
        this.mode = mode;
        this.caloriesBurned = calories;
    }
    
    public void getActivitys(){
        this.name = name;
        this.mode = mode;
        this.caloriesBurned = caloriesBurned;
    }
    
    @Override
    public String toString() {
        return name + " - " + mode + " - " + caloriesBurned + " calories";
    }
    
    
}
