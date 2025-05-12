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
    private String name;
    private String activity;
    /**
     * Constructor for objects of class Equipment
     */
    public Equipment(String name, String activity)
    {
        this.name = name;
        this.activity = activity;
    }

     public String getName() {
        return name;
    }

    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return name + " (used for " + activity + ")";
    }
}

