import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Random;

public class Clicker implements ActionListener {

    // variables
    private int buttonClicks = 0;
    private JLabel clickerLabel = new JLabel();
    private JFrame clickerFrame = new JFrame();
    private JButton button = new JButton();
    private JPanel clickerPanel = new JPanel();

    // Random number generator
    private Random random = new Random();
    // Reference: https://www.freecodecamp.org/news/generate-random-numbers-java/

    // constructor
    public Clicker() {
        
        // configure frame
        clickerFrame.setSize(600, 400); // width and height (in pixels)
        clickerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit when window closes
        clickerFrame.setTitle("Clicker GUI"); //sets title of window

        // configure panel
        clickerFrame.add(clickerPanel);
        clickerPanel.setLayout(null);
        
        //Configure button
        button.setText("Click Me!"); // sets the button's text to "Click Me!"
        button.setBounds(235, 170, 100, 30); // (new x, new y, width, height)
        button.addActionListener(this); // adds actionListener to increment clicks
        clickerPanel.add(button); // adds the button to the clicker panel

        // configure label
        clickerLabel.setText("Number of Clicks: 0"); // sets the label's text to "Number of Clicks: 0"
        clickerLabel.setBounds(220, 300, 200, 100); // (new x, new y, width, height)
        clickerPanel.add(clickerLabel); // ad the label to the clicker panel

        clickerFrame.setVisible(true); // shows the frame
        
    }//clicker contructor 

    
    // when user presses the button, this method is called
    public void actionPerformed(ActionEvent e) {
        // increment number of clicks and print it in a label
        buttonClicks++;
        clickerLabel.setText("Number of Clicks: " + buttonClicks );
        //Randomly generates x (0-490) and y (0-300) value and moves button to that coordinate
        button.setBounds( random.nextInt(490), random.nextInt(300), 100, 30); // (new x, new y, width, height)
    }//actionPerformed
    

}//clicker class