import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class Equipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipment
{
    private ArrayList <String> equ = new ArrayList<>();
    private HashMap<String, String> activity;
    /**
     * Constructor for objects of class Equipment
     */
    public Equipment()
    {
        // initialise instance variables
        equ.add("Skate");
        equ.add("Bike");
        equ.add("Skate");
        equ.add("Skate");
        equ.add("Skate");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listAllEquipments()
    {
        for(String equipment : equ){
            System.out.println(equipment);
        }
    }
}
