package footballer;

public abstract class Footballer {

    private String name;

    private boolean boots;

    private int pace;


// Constructor:

    public Footballer(String name, int pace) {
        this.name = name;
        this.pace = pace;
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

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public String canTalk(){
        return "Hey Ref! That's a foul";
    }

//    public String sprintSpeed(){
//        return String.format("My sprint speed is %d" this.pace);
//    }

// String. valueOf() and Integer. toString()


}