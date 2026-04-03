import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Clock class.
 */
public class MinuteTest {

    /**
     * Test that default Clock constructor sets minutes to 0.
     */
    @Test
    public void minuteRangeTest() {
        Clock testingClock = new Clock();
        int minutes = testingClock.getMinutes();
        assertEquals(0, minutes);
    }

}
