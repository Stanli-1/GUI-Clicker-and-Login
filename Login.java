import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Login implements ActionListener{

    // Declare Variables
    private JFrame loginFrame = new JFrame(); // window
    private JPanel loginPanel = new JPanel(); // layout
    private JButton loginButton = new JButton(); // login button
    
    private JLabel userLabel = new JLabel(); // label for username
    private JLabel passwordLabel = new JLabel(); // label for password
    private JLabel corectLogin = new JLabel(""); // label for successful login 
    // (intially "" because login isnt successful yet)

    
    private JTextField userText = new JTextField(); // text field bracket shows the length
    private JPasswordField passWordText = new JPasswordField(); // text field bracket shows the length

    
    public Login() {
        // configure login frame
        loginFrame.setSize(600, 400); // width and height (in pixels)
        loginFrame.setTitle("Login GUI"); // title of window
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes frame
        // configure login panel
        loginFrame.add(loginPanel);
        loginPanel.setLayout(null); // layout

        // configure username label
        userLabel.setText("Username");
        userLabel.setBounds(150, 50, 100, 100); // (new x, new y, width, height)
        loginPanel.add(userLabel); // add the label
        // configure username text
        userText.setBounds(250, 90, 200, 20); // (new x, new y, width, height)
        loginPanel.add(userText); // add the text field
        
        // configure password label
        passwordLabel.setText("Password");
        passwordLabel.setBounds(150, 100, 100, 100); // (new x, new y, width, height)
        loginPanel.add(passwordLabel); // add the label
        // configure password text
        passWordText.setBounds(250, 140, 200, 20); // (new x, new y, width, height)
        loginPanel.add(passWordText); // add the text field
    
        // configure login button
        loginButton.setText("Login");
        loginButton.setBounds(250, 180, 90, 25); // (new x, new y, width, height)
        loginButton.addActionListener(this); // add the action listener which is an object
        loginPanel.add(loginButton); // add the text field

        // configure correctLogin label
        corectLogin.setBounds(230, 200, 200, 100); // (new x, new y, width, height)
        loginPanel.add(corectLogin); // add the label
        
        loginFrame.setVisible(true); // display frame

    } //login constructor
    
    // this method is called if the button is clicked
    public void actionPerformed(ActionEvent e) {
        String usernameInput = userText.getText(); // get username  
        String passwordInput = passWordText.getText(); // get username   

        // if the username and password is correct, login
        if (usernameInput.equals("Stan") && passwordInput.equals("capybara")) {
            loginPanel.setBackground(Color.green); // change the background color to green 
            corectLogin.setText("Login Successful!");
            corectLogin.setBounds(235, 200, 200, 100); // (new x, new y, width, height)
        }
        // if the username and password is not correct, display the wrong login message
        else {
            loginPanel.setBackground(Color.red); // change the background color to red
            corectLogin.setText("Login Failed!");
            corectLogin.setBounds(250, 200, 200, 100); // (new x, new y, width, height)
        }
        
    } // actionPerformed method

    
} //Login

// Reference to change panel color: https://www.tutorialspoint.com/how-can-we-set-the-background-color-to-a-jpanel-in-java