package footballer;

public class Goalkeeper extends Footballer {

    public Goalkeeper(String name, int sprintSpeed){
        super(name, sprintSpeed);


    }

    public String useHands() {return String.format("%s used hands to catch the ball", getName());}

    @Override
    public int getSprintSpeed() {
        return super.getSprintSpeed();
    }

    @Override
    public void setSprintSpeed(int sprintSpeed) {
        super.setSprintSpeed(sprintSpeed);
    }

    public String demandBall(){
        return "I'm here!";
    }
}
