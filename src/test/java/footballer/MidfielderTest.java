package footballer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MidfielderTest {

    private Midfielder midfielder;

    @BeforeEach
    public void setUp(){
        midfielder = new Midfielder("KDB", 9);
    }

    @Test
    public void canTalk(){
        String expected = "Hey Ref! That's a foul";
        String actual = midfielder.canTalk();
        assertEquals(expected, actual);
    }

    @Test
    public void sprint(){
        String expected = "My sprint speed is 9" ;
        String actual = String.format("My sprint speed is %d",midfielder.getSprintSpeed());
        assertEquals(expected, actual);
    }
}
