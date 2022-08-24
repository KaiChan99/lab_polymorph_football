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
//    Why is this method never used?
}
