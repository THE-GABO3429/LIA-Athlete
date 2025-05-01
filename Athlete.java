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
    
    private void age(){
        int age = 30;
        System.out.println(age);
    }
    
    private void weightInKg(){
        int weight = 200;
        System.out.println(weight);
    }
    
    //private String gender(String Male, String Female, String Other){
    //    
    //}
    
    //public String AtheleDetails(){
    //    System.out.println("Their age: " + age());
    //    System.out.println("Their weight: " + this.weight() + "Kg");
    //    System.out.println("Their gender: " + this.gender());
    //}
}
