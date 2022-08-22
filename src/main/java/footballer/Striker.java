package footballer;

public class Striker extends Footballer {

    public Striker(String name, int pace){
        super(name,pace);



    }

    @Override
    public String canTalk(){
        return "SIUUUUUUU";
    }

}
