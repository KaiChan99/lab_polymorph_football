package footballer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalkeeperTest {

    private Goalkeeper goalkeeper;

    @BeforeEach
    public void setUp(){
        goalkeeper = new Goalkeeper("cat", 8);
    }

    @Test
    public void canTalk(){
        String expected = "Hey Ref! That's a foul";
        String actual = goalkeeper.canTalk();
        assertEquals(expected, actual);
    }

    @Test
    public void sprint(){
        String expected = "My sprint speed is 8" ;
        String actual = String.format("My sprint speed is %d",goalkeeper.getSprintSpeed());
        assertEquals(expected, actual);
    }

    @Test
    public void useHands(){
        String expected = "cat used hands to catch the ball";
        String actual = String.format("%s used hands to catch the ball",goalkeeper.getName());
        assertEquals(expected, actual);
    }

}
