import java.util.ArrayList;
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Team {
    private String teamName;
    private Coach coach;
    private ArrayList<Athlete> athletes;

    public Team(String teamName, Coach coach) {
        this.teamName = teamName;
        this.coach = coach;
        this.athletes = new ArrayList<>();
    }

    // Getters
    public String getTeamName() {
        return teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    // Setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    // Add athlete to the team
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    @Override
    public String toString() {
        return "Team: " + teamName + "\nCoach: " + coach.getName() + "\nNumber of Athletes: " + athletes.size();
    }
}

