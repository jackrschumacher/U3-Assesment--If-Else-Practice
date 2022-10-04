
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
    System.out.println("You wake up. What do you do?");
    System.out.println(" 1. Take a shower \n 2.Go to work \n 3. Go for a walk");
    // Have user input a number between 1&3 in order to create a valid output
    int wakeupChoice = input.nextInt();
    if (wakeupChoice == 1) {
      System.out.println("You take a shower. Now you are ready for the day");
      System.out.println("You need to eat breakfast before you go to work. What do you want to eat?");
      
    else if(wakeupChoice == 2){
      
    }
    else if(wakeup == 3){
      
    }
    else{
      
    }
  }
}