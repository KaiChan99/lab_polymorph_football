package footballer;

public abstract class Footballer {

    private String name;

    private boolean boots;

    private int sprintSpeed;


// Constructor:

    public Footballer(String name, int sprintSpeed) {
        this.name = name;
        this.sprintSpeed = sprintSpeed;
        this.boots = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasBoots() {
        return boots;
    }

    public void setBoots(boolean boots) {
        this.boots = boots;
    }

    public int getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(int sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public String canTalk(){
        return "Hey Ref! That's a foul";
    }

    public String sprint(){
        return String.format("My sprint speed is %d" ,this.sprintSpeed);
    }

// String. valueOf() and Integer. toString()


}