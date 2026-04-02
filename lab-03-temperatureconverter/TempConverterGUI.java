import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The {TempConverterGUI} class provides a graphical user interface
 * for converting temperatures between Fahrenheit and Celsius.
 * It extends {JFrame} and contains input fields, labels, and a button
 * for performing the conversion.
 */
public class TempConverterGUI extends JFrame {
    
    private JTextField fahrenheitInput;
    private JTextField celsiusInput;
    private JTextField lastEdited;

        /**
     * Constructs a {@code TemperatureConverter} with the specified title.
     *
     * @param title the title of the window
     */
    public TempConverterGUI(String title) {

        super(title);

        JPanel content = new JPanel();
        super.setSize(500, 200);
        content.setLayout(new FlowLayout()); 
        this.setContentPane(content);

        fahrenheitInput = new JTextField(10);
        content.add(new JLabel("Fahrenheit:"));
        content.add(fahrenheitInput);

        celsiusInput = new JTextField(10);
        content.add(new JLabel("Celsius:"));
        content.add(celsiusInput);

        JButton convertButton = new JButton("Convert");
        content.add(convertButton);

        convertButton.addActionListener((ActionEvent e) -> {
            try {
                if (lastEdited == fahrenheitInput) {
                    double fahrenheit = Double.parseDouble(fahrenheitInput.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    celsiusInput.setText(String.format("%.2f", celsius));
                } else if (lastEdited == celsiusInput) {
                    double celsius = Double.parseDouble(celsiusInput.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    fahrenheitInput.setText(String.format("%.2f", fahrenheit));
                }
            } catch (RuntimeException exception) {
                JOptionPane.showMessageDialog(null, exception);
            }
        });

        fahrenheitInput.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                lastEdited = fahrenheitInput;
            }
        });

        celsiusInput.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                lastEdited = celsiusInput;
            }
        });

        content.setVisible(true);
    }
}
