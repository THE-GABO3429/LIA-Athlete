import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private int x;
    private Activity activity;
    private Athlete athlete;
    private ArrayList<Athlete> athletes = new ArrayList<>();
    private ArrayList<Activity> activities = new ArrayList<>();
    
    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     Driver app = new Driver();
     
     System.out.println("Menu");
     System.out.println("==================================================");
     System.out.println("A: Add a new Athlete");
     System.out.println("B: Add a new Activity");
     System.out.println("C: List all Athletes");
     System.out.println("D: List all Activities");
     System.out.println("E: Exit");
       
     String input = scanner.nextLine().toUpperCase();
     
     switch(input){
         case "A":app.newAthlete(scanner);
         break;
         
         case "B": app.newActivity(scanner);
         break;
         
         case "C": //listAthletes
         
         case "D": //listActivites
         
         case "E": System.out.println("Goodbye");
         break;
         default: System.out.println("Invalid Try Again");
     }
     
    }
    
    public void newAthlete(Scanner input){
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        
        System.out.print("Year of Birth: ");
        int birthYear = Integer.parseInt(input.nextLine());
        
        Athlete athlete = new Athlete(firstName, lastName, birthYear);
        athletes.add(athlete);
        System.out.println("Athlete added: " + athlete);
        
        /**
         * TO BE FINSHED GENDER*
         * 
         * 
         * 
         */
    }
    
    
    
    public void newActivity(Scanner scanner){
        System.out.print("Enter activity name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter activity mode (e.g., Running, Swimming): ");
        String mode = scanner.nextLine();
        
        System.out.print("Enter calories burned: ");
        int calories = Integer.parseInt(scanner.nextLine());
        
        Activity activity = new Activity(name, mode, calories);
        activities.add(activity);
        
        System.out.println("Activity added: " + activity);

    }
}
