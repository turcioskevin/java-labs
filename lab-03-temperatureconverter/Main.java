import javax.swing.JFrame;

/**
 * The Main class serves as the entry point for the Temperature Converter application.
 * It creates and displays the main window for the application.
 */
public class Main {
    public static void main(String[] args) {
        TempConverterGUI window = new TempConverterGUI("Temperature Converter");
                window.setSize(400, 150);
                window.setLocation(200, 200);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
    }
}
