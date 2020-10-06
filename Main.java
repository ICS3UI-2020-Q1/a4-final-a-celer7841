import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user for a number
    System.out.println("Please enter a positive integer to determine its factors:");
    
    // declare variable to store the users number
    int userNum = input.nextInt();

    // declare a variable to divide the users number by
    int divisor = 0;

    // create if else statement to check if the number is positive or not 
    if(userNum >0){
      System.out.println("The factors of " + userNum + " are: ");

      // create while loop to divide the users numberby every integer
      while (userNum >0){
        divisor = divisor +1;

        // declare variable to store the remainder of the quotient of the users numnber and divisor
        int remainder = userNum % divisor;

        // write if statement to print out the factor if the remainder of the quotient is 0
        if (remainder == 0){
          System.out.println(divisor);
        }
     }
     }
    else {
      System.out.println("Please enter a positive integer");
    }
  }
}

