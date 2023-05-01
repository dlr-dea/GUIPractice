import javax.swing.*;
import javax.swing.JLabel;
import  javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.JTextField;
import javax.swing.JButton;

public class Main {

    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

    GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.setVisible(true);


        /*
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("User");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(100, 20,165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(100,80,80,25);
        button.addActionListener(new Main());
        panel.add(button);

        success = new JLabel();
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);


         */

    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("admin") &&  password.equals("admin123")){
            success.setText("Login Success");
        }
    }

     */
}
