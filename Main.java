import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {

      // scanner for customer's choice of number of rings
      Scanner userInput = new Scanner(System.in);
      int input;
      boolean done = false;

      // beginning prompt
      System.out.println("\n------------------------------------------------------------------------------");
      System.out.println("\nWelcome to Stan's GUI Login and Clicker!");
      
      while (done == false) {
          System.out.print("\nEnter '1' for the login or '2' for the clicker or '0' to exit:    ");
          input = userInput.nextInt();

          switch(input) {
            case 0: //user quits
                done = true;
                break;
                  
            case 1: //login
                System.out.println("\nNote that for this login:");
                System.out.println("Correct Username: Stan");
                System.out.println("Correct Password: capybara");
                new Login();
                break;
                  
            case 2: //clicker
                System.out.println("\nEvery time you click the button, it will move!");
                new Clicker();
                break;
                  
            default:
                System.out.println("\nInvalid Input! Please try again.");
                break;
                  
          } //switch  
          System.out.println("\n------------------------------------------------------------------------------");
          
      }//while

      System.out.print("\nThank you for using this program!    ");
      
  }//main
    
} //Main