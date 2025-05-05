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
    private int yearOfBirth;
    private int weight;
    private String gender;
    
    //+ listActivitys : ArrayList
    //+ AtheleDetails: String
    //+ gender : String(Male, Female, Other)
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(int yearOfBirth, int weight, String gender)
    {
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.gender = gender;
        
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
    
    
    public static void main(String[] creatAthletes) {
        Athlete a = new Athlete(25, 70, "Male");
        System.out.println();
    }


    
    
    //public int age(insertAge){
      //  return age;
    //}
    
    //private void weightInKg(){
     //   int weight = 200;
       // System.out.println(weight);
    //}
    
    //private String gender(String Male, String Female, String Other){
    //    
    //}
    
    public String atheleDetails(){
        return "Their year of birth: " + yearOfBirth + 
        "\nTheir weight: " + weight + 
        "Kg\nTheir gender: " + gender;
    }
    public void getAthleteDetails(){
        System.out.println(this.atheleDetails());
    }
}
