
/**
 * TimeComparator is the main program for the Clock Appointment Checker.
 * 
 * <p>
 * This program compares a user-entered time to a fixed appointment time
 * (12:30 p.m.) and prints whether the user is late or not.
 * </p>
 * 
 * <p>
 * It prompts the user for:
 * <ul>
 *   <li>Hour (1-12)</li>
 *   <li>Minute (0-59)</li>
 *   <li>Meridian ("a.m." or "p.m.")</li>
 * </ul>
 * </p>
 *
 * Example run:
 * <pre>
 * What hour should the clock be set to? 11
 * What minute should the clock be set to? 45
 * Is it a.m. (a) or p.m. (p)? a
 * You're not late!
 * </pre>
 *
 * @author Kevin Turcios
 * @version 1.0
 */
public class TimeComparator {
    static Scanner input = new Scanner(System.in);

    /**
     * The main method that runs the program.
     * It creates the appointment time and user time, compares them,
     * and prints whether the user is late.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Clock appointmentTime = new Clock(12, 30, "p.m.");
        Clock userTime = new Clock(getUserHours(), getUserMinutes(), getUserMeridian());

        if (Clock.getEarlier(userTime, appointmentTime) == userTime) {
            System.out.println("You're not late!");
        } else {
            System.out.println("You're late!");
        }
    }

    /**
     * Prompts the user for hours (1-12) for the clock.
     * @return the hour entered by the user
     */
    public static int getUserHours() {
        System.out.print("What hour should the clock be set to? ");
        int hours = input.nextInt();
        input.nextLine(); // consumes the trailing newline
        return hours;
    }

    /**
     * Prompts the user for minutes (0-59) for the clock.
     * @return the minutes entered by the user
     */
    public static int getUserMinutes() {
        System.out.print("What minute should the clock be set to? ");
        int minutes = input.nextInt();
        input.nextLine(); // consumes the trailing newline
        return minutes;
    }

    /**
     * Prompts the user to enter whether the time is a.m. or p.m.
     * @return "a.m." or "p.m." based on user input
     */
    public static String getUserMeridian() {
        System.out.print("Is it a.m. (a) or p.m. (p)? ");
        String answer = input.nextLine();
        if (answer.toLowerCase().startsWith("a")) {
            return "a.m.";
        } else {
            return "p.m.";
        }
    }
}
