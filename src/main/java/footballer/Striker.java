package footballer;

public class Striker extends Footballer {

    public Striker(String name, int pace){
        super(name);
        super(pace);


    }

    @Override
    public String canTalk(){
        return "SIUUUUUUU";
    }

}
