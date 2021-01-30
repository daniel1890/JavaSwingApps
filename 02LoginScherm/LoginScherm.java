import javax.swing.*;

public class LoginScherm extends JFrame {
    private JPanel mainPaneel;
    private JLabel gebruikersnaamLabel;
    private JLabel wachtwoordLabel;
    private JTextField gebruikersnaamVeld;
    private JPasswordField wachtwoordVeld;
    private JButton loginKnop;

    public LoginScherm(String titel) {
        super(titel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPaneel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new LoginScherm("Login Scherm.");
        frame.setVisible(true);
    }

}
