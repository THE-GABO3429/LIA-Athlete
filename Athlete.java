import java.util.ArrayList;
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int birthYear;
    private Gender gender;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();
    
    //+ listActivitys : ArrayList
    //+ AtheleDetails: String
    //+ gender : String(Male, Female, Other)
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String firstName, String lastName, int birthYear, Gender gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
        
    }
    @Override

    public String toString() {
        return firstName + " " + lastName + " (" + birthYear + "), Gender: "+ gender;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void burntCalories()
    {
        // put your code here
        int bCal = 100;
        System.out.println(bCal);
    }
    
    public void getTotalDistanceInMeters(){
        int distance = 500;
        System.out.println(distance);
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
     public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }
    
    public ArrayList<Equipment> getEquipmentList(){
        return equipmentList;
    }

    public void listEquipment() {
        if (equipmentList.isEmpty()) {
            System.out.println("No equipment for this athlete.");
        } else {
            System.out.println("Equipment used by " + getFullName() + ":");
            for (Equipment e : equipmentList) {
                System.out.println("- " + e);
            }
        }
    }
}


