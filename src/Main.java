import javax.swing.*;
import javax.swing.JLabel;
import  javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("User");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20,165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        frame.setVisible(true);

    }
}