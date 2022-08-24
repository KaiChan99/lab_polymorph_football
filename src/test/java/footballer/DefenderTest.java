package footballer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefenderTest {

    private Defender defender;

    @BeforeEach
    public void setUp(){
        defender = new Defender("VVD", 9);
    }

    @Test
    public void canTalk(){
        String expected = "Hey Ref! That's a foul";
        String actual = defender.canTalk();
        assertEquals(expected, actual);
    }

    @Test
    public void sprint(){
        String expected = "My sprint speed is 9" ;
        String actual = String.format("My sprint speed is %d",defender.getSprintSpeed());
        assertEquals(expected, actual);
    }
}
