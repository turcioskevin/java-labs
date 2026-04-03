/**
 * Clock represents a time of day using 12-hour format.
 *
 * <p>
 * Each Clock object stores:
 * <ul>
 *   <li>hours (1-12)</li>
 *   <li>minutes (0-59)</li>
 *   <li>meridian ("a.m." or "p.m.")</li>
 * </ul>
 * </p>
 *
 * <p>
 * Clock also includes a static method to determine which of two clocks
 * represents an earlier time.
 * </p>
 * 
 * Example:
 * <pre>
 * Clock c1 = new Clock(11, 45, "a.m.");
 * Clock c2 = new Clock(12, 30, "p.m.");
 * Clock earlier = Clock.getEarlier(c1, c2);
 * </pre>
 * 
 * @author Kevin
 * @version 1.0
 */
public class Clock {
    private int hours;
    private int minutes;
    private String meridian;

    /**
     * Default constructor. Sets time to 12:00 a.m.
     */
    public Clock() {
        hours = 12;
        minutes = 0;
        meridian = "a.m.";
    }

    /**
     * Constructor with specified time.
     *
     * @param hours the hour (1-12)
     * @param minutes the minute (0-59)
     * @param meridian "a.m." or "p.m."
     */
    public Clock(int hours, int minutes, String meridian) {
        this.hours = hours;
        this.minutes = minutes;
        this.meridian = meridian;
    }

    /**
     * Returns the string representation of the clock.
     *
     * @return formatted time as "H:MM a.m./p.m."
     */
    @Override
    public String toString() {
        String time = hours + ":";
        if (minutes < 10) {
            time += "0";
        }
        time += minutes + " " + meridian;
        return time;
    }

    /**
     * Returns the earlier of two clocks.
     *
     * @param c1 first Clock
     * @param c2 second Clock
     * @return the Clock object representing the earlier time
     */
    public static Clock getEarlier(Clock c1, Clock c2) {
        if (c1.meridian.equals("a.m.") && c2.meridian.equals("p.m.")) {
            return c1;
        } else if (c1.meridian.equals("p.m.") && c2.meridian.equals("a.m.")) {
            return c2;
        } else {
            if (c1.hours == 12 && c2.hours != 12) {
                return c1;
            } else if (c2.hours == 12 && c1.hours != 12) {
                return c2;
            } else {
                if (c1.hours < c2.hours) {
                    return c1;
                } else if (c2.hours < c1.hours) {
                    return c2;
                } else {
                    if (c1.minutes < c2.minutes) {
                        return c1;
                    } else if (c2.minutes < c1.minutes) {
                        return c2;
                    } else {
                        return c1;
                    }
                }
            }
        }
    }

    /**
     * Returns the minutes of this Clock.
     * 
     * @return minutes (0-59)
     */
    public int getMinutes() {
        return minutes;
    }
}
