
/**
 * Write a description of class Coach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coach {
    private String firstName;
    private String lastName;
    private int birthYear;
    private Gender gender;
    private int experienceYears;

    public Coach(String firstName, String lastName, int birthYear, Gender gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
        
    }

    public String toString() {
        return firstName + " " + lastName + " (" + birthYear + "), Gender: "+ gender;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
    
}

