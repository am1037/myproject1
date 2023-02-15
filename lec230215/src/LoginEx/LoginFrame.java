package LoginEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    JTextField idField, passwordField;
    JButton loginButton, signupButton;

    public LoginFrame() {
        super("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set the layout of the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        // Create and add the ID field
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField(20);
        JPanel idPanel = new JPanel();
        idPanel.add(idLabel);
        idPanel.add(idField);
        mainPanel.add(idPanel);

        // Create and add the password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        JPanel passwordPanel = new JPanel();
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        mainPanel.add(passwordPanel);

        // Create and add the login and signup buttons
        loginButton = new JButton("Login");
        signupButton = new JButton("Signup");
        loginButton.addActionListener(this);
        signupButton.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(signupButton);
        mainPanel.add(buttonPanel);

        // Add the main panel to the frame
        getContentPane().add(mainPanel);

        // Set the size of the frame and make it visible
        setSize(600, 800);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String id = idField.getText();
            String password = passwordField.getText();
            // Perform login logic here
        } else if (e.getSource() == signupButton) {
            // Perform signup logic here
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}