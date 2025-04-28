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
    private int x;
    //+ listActivitys : ArrayList
    //+ AtheleDetails: String
    //+ gender : String(Male, Female, Other)
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int burntCalories(int bCal)
    {
        // put your code here
        bCal = 100;
        return bCal;
    }
    
    public int getTotalDistanceInMeters(int distance){
        distance = 500;
        return distance;
    }
    
    private int age(int age){
        age = 30;
        return age;
    }
    
    private int weightInKg(int weight){
        weight = 200;
        return weight;
    }
    
    private String gender(String Male, String Female, String Other){
        
    }
    
    public String AtheleDetails(){
        System.out.println("Their age: " + this.age());
        System.out.println("Their weight: " + this.weight() + "Kg");
         System.out.println("Their gender: " + this.gender());
    }
}
