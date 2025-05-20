import java.util.HashMap;

/**
 * Adds [powered] if the activity is a powered activity
 *
 * 
 */
public class poweredActivities extends Activity
{
    // instance variables - replace the example below with your own
    private HashMap<String, Double> sportsInt = new HashMap<>();
    private Equipment equipment;
    public poweredActivities(String name, String mode, int caloriesBurned,  Athlete athlete, Equipment equipment, double distance) 
    {
        super(name, mode, caloriesBurned, athlete, equipment, distance);
    }
    
    
    
    @Override
    public String toString() {
    String warning = (getEquipment() == null) ? " No equipment!" : "";
    return super.toString() + " [Powered]" + warning;
    }
}
    
