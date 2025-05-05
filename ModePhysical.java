import java.util.*;

/**
 * Write a description of class ModePhysical here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModePhysical
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList <String> mode = new ArrayList<>();
    //private HashMap<String, String> activity;
    /**
     * Constructor for objects of class Equipment
     */
    public ModePhysical()
    {
        // initialise instance variables
        mode.add("Skate");
        mode.add("Bike");
        mode.add("Skate");
        mode.add("Skate");
        mode.add("Skate");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listAllMode()
    {
        for(String equipment : mode){
            System.out.println(equipment);
        }
    }
}
