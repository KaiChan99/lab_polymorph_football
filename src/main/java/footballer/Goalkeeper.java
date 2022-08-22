package footballer;

public class Goalkeeper extends Footballer {

    public Goalkeeper(String name, int pace){
        super(name, pace);


    }

    public String useHands() {return String.format(getName()," %s. Used hands to catch the ball");}
}
