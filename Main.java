/**
Jack Schumacher
AP CS A
Orange (5)
Chapter 3 - Boolean Expressions
Programming A

*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Import Scanner and create a new scanner object
    Scanner input = new Scanner(System.in); 
    System.out.println("Welcome to Life Simulator");
    // Print title and offer first options
    System.out.println("You wake up. What do you do? (1.Go to Shower, 2.Go to Work, 3.Go to Park)");
    // Have user input 
    int wakeupChoice  = input.nextInt();
    if (wakeupChoice == 1){
      System.out.println("You take a shower. Now you are ready for the day.");
    }
    else if (wakeupChoice == 2){
      System.out.println("You go to work. Since you did not shower, you smell and are therfore fired from your job.");
    }
    else if(wakeupChoice == 3){
      System.out.println("You go for a walk and burn 1,000 calories and therfore a fit.");
    }
    else{
      System.out.println("Input Error. Input a number between 1-3");
      // Error Prep -> Tells user to input number between 1-3 in order to have a valid output
      
    }
  }
}