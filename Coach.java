
/**
 * Write a description of class Coach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coach {
    private String name;
    private int experienceYears;

    public Coach(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Coach: " + name + " | Experience: " + experienceYears + " years";
    }
}

