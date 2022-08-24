package footballer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikerTest {

    private Striker striker;

    @BeforeEach
    public void setUp(){
        striker = new Striker("bob", 10);
    }

    @Test
    public void canTalk(){
        String expected = "SIUUUUUUU";
        String actual = striker.canTalk();
        assertEquals(expected, actual);
    }

//    @Test
//    public void canTalk(String assistName){
//        String assistName = "Ozil";
//        String expected = String.format("Nice pass! %s" + assistName);
//        String actual = striker.canTalk("Ozil");
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void canTalk(String = "Ozil"){
//        String expected = String.format("Nice pass! %s" + assistName);
//        String actual = striker.canTalk("Ozil");
//        assertEquals(expected, actual);
//    }

    @Test
    public void sprint(){
        String expected = "My sprint speed is 10" ;
        String actual = String.format("My sprint speed is %d",striker.getSprintSpeed());
        assertEquals(expected, actual);
    }

    @Test
    public void demandBall(){
        String expected = "I'm here!";
        String actual = striker.demandBall();
        assertEquals(expected, actual);
    }


//    This test doesn't run
//    @Test
//    public void demandBall(String message){
//        String expected = "KDB is free!";
//        String actual = striker.demandBall("KDB");
//        assertEquals(expected, actual);
//    }


}
