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
     boolean running = true;
     
     while(running){
     System.out.println("Menu");
     System.out.println("==================================================");
     System.out.println("A: Add a new Athlete");
     System.out.println("B: Add a new Activity");
     System.out.println("C: Assign equipment to an athlete");
     System.out.println("D: List all Athletes");
     System.out.println("E: List all Activities");
     System.out.println("F: List Activities by Athlete"); 
     System.out.println("G: Exit");
       
     String input = scanner.nextLine().toUpperCase();
     
     switch(input){
         case "A":app.newAthlete(scanner);
         break;
         
         case "B": app.newActivity(scanner);
         break;
         
         case "C": app.assignEquipmentToAthlete(scanner);
         break;
         
         case "D": app.listAllAthletes();
         break;
         
         case "E": app.listAllActivities();
         break;
         
         case "F": app.listActivitiesByAthlete(scanner);
         break;
         
         case "G": System.out.println("Goodbye");
         running = false;
         break;
         default: System.out.println("Invalid Try Again");
     } 
    }
     scanner.close();

    }
    
    public void newAthlete(Scanner input){
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        
        System.out.print("Year of Birth: ");
        int birthYear = Integer.parseInt(input.nextLine());
        
        Gender gender = null;
        while(gender == null){
            System.out.println("Select gender: MALE / FEMALE / OTHER");
            try{ gender = Gender.valueOf(input.nextLine().trim().toUpperCase());
            }catch (IllegalArgumentException e){
             System.out.println("Invalid input.");  
            }
        }
        
        Athlete athlete = new Athlete(firstName, lastName, birthYear, gender);
        athletes.add(athlete);
        System.out.println("Athlete added: " + athlete);
    }
    
    public void newActivity(Scanner scanner){
        System.out.print("Enter activity name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter activity mode (e.g., Running, Swimming): ");
        String mode = scanner.nextLine();
        
        System.out.print("Enter calories burned: ");
        int calories = Integer.parseInt(scanner.nextLine());
        
        if(athletes.isEmpty()){
            System.out.println("No athletes found. Please add an athlete first.");
            return;
        }
        
        System.out.println("Activity preformed:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println(i + ": " + athletes.get(i).getFullName());    
        } 
        
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index >= athletes.size()) {
        System.out.println("Invalid selection.");
        return;
        }
        
        Athlete selectedAthlete = athletes.get(index);
        
        System.out.print("Enter equipment name (or press Enter to skip): ");
        String equipmentName = scanner.nextLine();
        
        Equipment equipment = null;
        
        if(!equipmentName.isEmpty()){
            System.out.print("Enter activity this equipment is used for: ");
            String equipmentActivity = scanner.nextLine();
            equipment = new Equipment(equipmentName, equipmentActivity);
        }
        
        Activity activity = new Activity(name, mode, calories, selectedAthlete, equipment);
        activities.add(activity);
        
        System.out.println("Activity added: " + activity);

    }
    
    public void listAllAthletes(){
        if (athletes.isEmpty()){
          System.out.println("No athletes have been detected.");
        }else{
            System.out.println("List of Athletes:");
            for (Athlete a : athletes){
                System.out.println(a);
            }
        }
    }
    
    public void listAllActivities(){
        if(activities.isEmpty()){
            System.out.println("No activities detected.");
        }else{
            System.out.println("List of Activities:");
            for(Activity a : activities){
                System.out.println(a);
            }
        }
        }
        
    public void listActivitiesByAthlete(Scanner scanner){
        if(athletes.isEmpty()){
            System.out.println("No athletes have been detected.");
            return;
        }
        System.out.println("Choose an athlete");
        for(int i = 0; i < athletes.size(); i++){
            System.out.println(i + ": " + athletes.get(i).getFullName());
        }
        int index;
        try{
            index = Integer.parseInt(scanner.nextLine());
            if(index < 0 || index>= athletes.size()){
                System.out.println("Invaild selection.");
                return;
            }
            }catch(NumberFormatException e){
                System.out.println("Invalid number.");
                return;
            }
        Athlete selectedAthlete = athletes.get(index);
        System.out.println("Activities by " + selectedAthlete.getFullName() + ":");
        
        boolean found = false;
        for(Activity a : activities){
            if(a.getAthlete() != null && a.getAthlete() == selectedAthlete){
                System.out.println(a);
                found = true;
            }
        }
        if(!found){
            System.out.println("No activities found for this athlete.");
        }
        }
        
    public void assignEquipmentToAthlete(Scanner scanner) {
    if (athletes.isEmpty()) {
        System.out.println("No athletes available.");
        return;
    }    
    
    System.out.println("Choose an athlete:");
    for (int i = 0; i < athletes.size(); i++) {
        System.out.println(i + ": " + athletes.get(i).getFullName());
    }
    
    int index = Integer.parseInt(scanner.nextLine());
    if (index < 0 || index >= athletes.size()) {
        System.out.println("Invalid selection.");
        return;
    }
    
    Athlete selectedAthlete = athletes.get(index);
    
    System.out.print("Enter equipment name: ");
    String equipmentName = scanner.nextLine();
    
    System.out.print("Enter activity this equipment is used for (e.g., Running, Soccer): ");
    String equipmentActivity = scanner.nextLine();
    
    Equipment newEquipment = new Equipment(equipmentName, equipmentActivity);
    selectedAthlete.addEquipment(newEquipment);
    
    System.out.println("Equipment added to " + selectedAthlete.getFullName());
    
    }
}
