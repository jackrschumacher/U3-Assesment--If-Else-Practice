
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
    System.out.println(" 1. Take a shower and get ready for your day. \n 2. Go for a walk \n 3. Go for a Drive");
    // Have user input a number between 1&3 in order to create a valid output
    int wakeupChoice = input.nextInt();
    if (wakeupChoice == 1) {
      System.out.println("You take a shower. Now you are ready for the day");
      System.out.println("What do you want to do today?");
      System.out.println(" 1. Sit around and play videogames \n 2. Go for a walk around town \n 3.Go to a new place today");
      int dayChoice = input.nextInt():
      if(dayChoice == 1){
        System.out.println("What video games do you want to play");
        System.out.println(" 1. Mario Cart \n 2. Tetris \n 3. Runescape")
          
      }
    }
    else if(wakeupChoice == 2){
      
    }
    else if(wakeupChoice == 3){
      
    }
    else{
      
    }
  }
}