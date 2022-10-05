
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
      int dayChoice = input.nextInt();
      if(dayChoice == 1){
        // Choice for Day #1
        System.out.println("What video games do you want to play");
        System.out.println(" 1. Mario Cart \n 2. Tetris \n 3. Runescape");
        int gameChoice = input.nextInt();
        if (gameChoice == 1){
          System.out.println("You play Mario cart and win the game.");
        }
        else if (gameChoice ==2){
          System.out.println("You play Tetris and get 1,300.");
        }
        else if (gameChoice == 3){
          System.out.println("You play Runescape (With Mr. Marzahl) and go fishing for 4 hours.");
        }
        else{
          System.out.println("You entered an invalid input. Please enter a number between 1&3.");
          // Tell user to restart and enter number between 1&3
        }
      }
      else if (dayChoice ==2){
        System.out.println("You decide to go for a walk around your town. What do you do when you are in the town?");
        System.out.println(" 1. Go eat Ice Cream at the town ice cream store \n 2. Go fishing in the town pond \n 3. Go get a burger from Culvers");
        // Users input selects an if statement that is true
        int townChoice = input.nextInt();
        if (townChoice == 1){
          System.out.println("You go to the town ice cream store and get a cup of mint chip ice cream. It tastes delicious.");
        }
        else if (townChoice == 2){
          System.out.println("You go fishing in the town pond and catch a bass.");
        }
        else if (townChoice == 3){
          System.out.println("You go to Culvers and get a double butterburger with bacon. It tastes delicious.");
        }
        else{
          System.out.println("You entered an invalid input. Please enter a number between 1&3.");
          // Tell user to restart and enter number between 1&3
        }
        
      }
      else if (dayChoice ==3){
        System.out.println("You decide to go to a new place today. Where would you like to go?");
        System.out.println(" 1.Canada \n 2.The United Kingdom \n 3.Switzerland");
        int placeChoice = input.nextInt();
        // Users input selects an option that satisfies the if (input = 1, etc.)
        if (placeChoice == 1){
          System.out.println("You travel to Canda. It is very cold there.");
        }
        else if (placeChoice == 2){
          System.out.println("You travel to the UK. While you are there you drink tea.");
        }
        else if (placeChoice == 3){
          System.out.println("You travel to Switzerland. While you are there, you buy a very expensive watch.");
        }
        else{
          System.out.println("You entered an invalid input. Please enter a number between 1&3.");
            // Tell user to restart and enter number between 1&3
          
        }
        
        
      }
      else{
        System.out.println("You entered an invalid input. Please enter a number between 1&3.");
          // Tell user to restart and enter number between 1&3
        
      }

    }
    else if(wakeupChoice == 2){
      System.out.println("You decide to go for a walk. Where should you go for a walk?");
      System.out.println(" 1. The town Park \n 2.A Natural Area near your home \n 3. A National Park");
      int parkChoice = input.nextInt();
      if (parkChoice == 1){
        System.out.println("You have chosen to go to the town park.");
        System.out.println("What do you want to do?");
        System.out.println(" 1. Go on a easy difficulty trail \n 2. Go on a medium difficulty trail \n 3.");
        
      }
      else if (parkChoice == 2){
        
      }
      else if (parkChoice == 3){
        
      }
      else{
        
      }
    }
    else if(wakeupChoice == 3){
      
    }
    else{
      
    }
  }
}