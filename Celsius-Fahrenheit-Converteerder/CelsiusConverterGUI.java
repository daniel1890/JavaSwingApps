import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {
    private JPanel mainPaneel;
    private JTextField celsiusTextVeld;
    private JLabel celsiusLabel;
    private JButton converteerKnop;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGUI(String titel) {
        super(titel);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(mainPaneel);
    this.pack();
        converteerKnop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Gebruik de text van celsiusTextVeld
                // Converteer naar een double
                // Update de waarde naar fahrenheit
                int tempFahr = (int)((Double.parseDouble(celsiusTextVeld.getText()))
                        * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Mijn Celsius Converter");
        frame.setVisible(true);
    }

}
