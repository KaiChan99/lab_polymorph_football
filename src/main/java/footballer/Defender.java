package footballer;

public class Defender extends Footballer {

    public Defender(String name, int sprintSpeed){
        super(name, sprintSpeed);



    }

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
