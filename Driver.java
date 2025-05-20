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
    private Coach coach;
    private ArrayList<Athlete> athletes = new ArrayList<>();
    private ArrayList<Activity> activities = new ArrayList<>();
    private ArrayList<Coach> coachs = new ArrayList<>();
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
            System.out.println("Main Menu");
            System.out.println("==================================================");
            System.out.println("A: Add");
            System.out.println("B: Assign");
            System.out.println("C: List");
            System.out.println("D: Calculate");
            System.out.println("E: Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine().toUpperCase();
     
            switch(input){
                case "A": showAddMenu(app, scanner);
                break;
         
                case "B": showAssignMenu(app, scanner);
                break;
                
                case "C": showListMenu(app, scanner);
                break;
         
                case "D": showCalculateMenu(app, scanner);
                break;
                
                case "E": System.out.println("Goodbye");
                running = false;
                break;
                default: System.out.println("Invalid Try Again");
            } 
        }
        scanner.close();

    }
    
    private static void showAddMenu(Driver app, Scanner scanner){
        System.out.println("Add Menu");
        System.out.println("A: New Athlete");
        System.out.println("B: New Activity");
        System.out.println("C: New Coach");
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().toUpperCase();
        
        switch(input){
            case "A": app.newAthlete(scanner); break;
            case "B": app.newActivity(scanner); break;
            case "C": app.creatCoach(scanner); break;
            default: System.out.println("Invalid input.");
        }
    }
    
    private static void showAssignMenu(Driver app,Scanner scanner){
        System.out.println("Assign Menu");
        System.out.println("A: Equipment to Athlete");
        System.out.println("B: Coach to Activity");
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().toUpperCase();
        
        switch (input){
            case "A": app.assignEquipmentToAthlete(scanner); break;
            case "B": app.assignCoachToActivity(scanner); break;
            default: System.out.println("Invalid input.");
        }
    }
    
    private static void showListMenu(Driver app, Scanner scanner){
        System.out.println("List Menu");
        System.out.println("A: All Athletes");
        System.out.println("B: All Activities");
        System.out.println("C: All Coaches");
        System.out.println("D: Activities by Athlete");
        System.out.println("E: Activities by Mode");
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().toUpperCase();
        
        switch(input){
            case "A": app.listAllAthletes(); break;
            case "B": app.listAllActivities(); break;
            case "C": app.listAllCoachs(); break;
            case "D": app.listActivitiesByAthlete(scanner); break;
            case "E": app.listActivitiesByMode(scanner); break;
            default: System.out.println("Invalid input.");
        }
    }
    
    private static void showCalculateMenu(Driver app, Scanner scanner){
        System.out.println("Calculate Menu");
        System.out.println("A: Distance by Athlete");
        System.out.println("B: Total Distance (All)");
        System.out.println("C: Calories Burned by Athlete");
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().toUpperCase();
        
        switch(input){
            case "A": app.calculateDistanceByAthlete(scanner); break;
            case "B": app.calculateTotalDistance(); break;
            case "C": app.calculateCaloriesByAthlete(scanner); break;
            default: System.out.println("Invalid input.");
        }
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
        
        System.out.print("Enter distance (in kilometers): ");
        double distance = Double.parseDouble(scanner.nextLine());
        
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
        
        Activity activity = new Activity(name, mode, calories, selectedAthlete, equipment, distance);
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
    
    public void listActivitiesByMode(Scanner scanner) {
    if (activities.isEmpty()) {
        System.out.println("No activities to list.");
        return;
    
        }
  

    System.out.print("Enter activity mode to filter by (e.g., Running, Soccer): ");
    String targetMode = scanner.nextLine().trim();

    boolean found = false;
    for (Activity a : activities) {
        if (a.getMode().equalsIgnoreCase(targetMode)) {
            System.out.println(a);
            found = true;
        }
    }

    if (!found) {
        System.out.println("No activities found for mode: " + targetMode);
    }
    }
    
    public void calculateDistanceByAthlete(Scanner scanner) {
    if (athletes.isEmpty()) {
        System.out.println("No athletes to choose from.");
        return;
    }

    System.out.println("Choose an athlete:");
    for (int i = 0; i < athletes.size(); i++) {
        System.out.println(i + ": " + athletes.get(i).getFullName());
    }

    int index = Integer.parseInt(scanner.nextLine());
    Athlete selectedAthlete = athletes.get(index);

    double totalDistance = 0;

    for (Activity a : activities) {
        if (a.getAthlete().equals(selectedAthlete)) {
            totalDistance += a.getDistance();
        }
    }

    System.out.println("Total distance by " + selectedAthlete.getFullName() + ": " + totalDistance + " km");
    }
    
    public void calculateCaloriesByAthlete(Scanner scanner) {
    if (athletes.isEmpty()) {
        System.out.println("No athletes to choose from.");
        return;
    }

    System.out.println("Choose an athlete:");
    for (int i = 0; i < athletes.size(); i++) {
        System.out.println(i + ": " + athletes.get(i).getFullName());
    }

    int index = Integer.parseInt(scanner.nextLine());
    Athlete selectedAthlete = athletes.get(index);

    int totalCalories = 0;

    for (Activity a : activities) {
        if (a.getAthlete().equals(selectedAthlete)) {
            totalCalories += a.getCaloriesBurned();
        }
    }

    System.out.println("Total calories burned by " + selectedAthlete.getFullName() + ": " + totalCalories + " calories");
    }
    
    public void calculateTotalDistance() {
    if (activities.isEmpty()) {
        System.out.println("No activities to calculate.");
        return;
    }

    double totalDistance = 0;

    for (Activity a : activities) {
        totalDistance += a.getDistance();
    }

    System.out.println("Total distance from all activities: " + totalDistance + " km");
    }
    
    public void creatCoach(Scanner input){
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
        
        Coach coach = new Coach(firstName, lastName, birthYear, gender);
        coachs.add(coach);
        System.out.println("Coach added: " + coach);
    }

    public void listAllCoachs(){
        if (coachs.isEmpty()){
          System.out.println("No coaches have been detected.");
        }else{
            System.out.println("List of Coaches:");
            for (Coach a : coachs){
                System.out.println(a);
            }
        }
        
        boolean found = false;
        for (Activity act : activities) {
                if (act.getCoach() != null && act.getCoach().equals(x)) {
                    System.out.println("  Assigned to: " + act.getName() + " (" + act.getMode() + ")");
                    found = true;
                }
            }

        if (!found) {
                System.out.println("  No activities assigned.");
            }

        }
        
    
    
     public void assignCoachToActivity(Scanner scanner) {
     if (activities.isEmpty() || coachs.isEmpty()){
         System.out.println("One coach or activity must exist");
         return;
         
     }
    
     System.out.println("Choose an activity:");
     for(int i=0;i< activities.size();i++){
         System.out.println(i + ": " + activities.get(i).getName());
     }
     
     int activityIndex;
    try {
        activityIndex = Integer.parseInt(scanner.nextLine());
        if (activityIndex < 0 || activityIndex >= activities.size()) {
            System.out.println("Invalid activity selection.");
            return;
        }
    } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number.");
        return;
    }

    Activity selectedActivity = activities.get(activityIndex);

    System.out.println("Choose a coach:");
    for (int i = 0; i < coachs.size(); i++) {
        System.out.println(i + ": " + coachs.get(i).getFullName());
    }

    int coachIndex;
    try {
        coachIndex = Integer.parseInt(scanner.nextLine());
        if (coachIndex < 0 || coachIndex >= coachs.size()) {
            System.out.println("Invalid coach selection.");
            return;
        }
    } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number.");
        return;
    }

    Coach selectedCoach = coachs.get(coachIndex);
    selectedActivity.setCoach(selectedCoach);
    System.out.println("Coach " + selectedCoach.getFullName() + " assigned to activity: " + selectedActivity.getName());
    }
}