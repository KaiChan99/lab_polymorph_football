package footballer;

public class Striker extends Footballer {

    public Striker(String name, int sprintSpeed){
        super(name,sprintSpeed);



    }

//    @Override
    public String canTalk(){
        return "SIUUUUUUU";
    }

    public String canTalk(String assistName){
        return "Nice pass! %s" +assistName;
    }

    @Override
    public int getSprintSpeed() {
        return super.getSprintSpeed();
    }

    @Override
    public void setSprintSpeed(int sprintSpeed) {
        super.setSprintSpeed(sprintSpeed);
    }

//    I've had to do an override in order to get sprintSpeed into StrikerTest, how come?
//    had to override and use super.getSprintspeed


    public String demandBall(){
        return "I'm here!";
    }

    public String demandBall(String message){
        return "%s is free!" + message;
    }
}
