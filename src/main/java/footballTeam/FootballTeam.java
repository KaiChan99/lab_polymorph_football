package footballTeam;

import footballer.Footballer;

import java.util.ArrayList;

public class FootballTeam {

    private String name;
    private ArrayList<Footballer> squad;

    public FootballTeam(String name){
        this.name = name;
        this.squad = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Footballer> getSquad() {
        return squad;
    }

    public void setSquad(ArrayList<Footballer> squad) {
        this.squad = squad;
    }

    public String squadAnnouncement() {
        for (Footballer player : this.squad) {
            return String.format("Player %s, " ,name);
        }

        return null;
    }



}
