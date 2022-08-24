package footballer;

public class Goalkeeper extends Footballer {

    public Goalkeeper(String name, int sprintSpeed){
        super(name, sprintSpeed);


    }

    public String useHands() {return String.format(" %s. Used hands to catch the ball", getName());}
}
