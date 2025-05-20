import java.util.ArrayList;
import java.util.HashMap;

/**
 * Place holder for Equipment
 *
 * 
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

