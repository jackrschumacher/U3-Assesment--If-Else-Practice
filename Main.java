
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
      System.out.println("You decide to go for a park. Where should you go?");
      System.out.println(" 1. The town Park \n 2.A Natural Area near your home \n 3. A National Park");
      int parkChoice = input.nextInt();
      
      if (parkChoice == 1){
        System.out.println("You have chosen to go to the town park.");
        System.out.println("What do you want to do?");

        System.out.println(" 1. Go on a easy difficulty trail \n 2. Go on a medium difficulty trail \n 3.Go on a difficult Hike");   
        int trailChoice = input.nextInt();
        // Users input selects an option that satisfies the if (input = 1, etc.)
        if (trailChoice ==1){
          System.out.println("You go on an easy trail at the town park. There is not much intresting to see on the trail, and you wish that you would have picked a more difficult trail with something to see");
        }
        else if (trailChoice == 2){
          System.out.println("You go on a medium difficult trail at the town park. This trail is more intresting that the easy trail and offers more exciting features and views. You return to the trailhead happy with your walk.");
        }
        else if (trailChoice == 3){
          System.out.println("You go on a more difficult hike. It offers great views of the surrounding area and is very intresting. You return to your car happy.");
        }
        else{
          System.out.println("You entered an invalid input. Please enter a number between 1&3.");
          // Tell user to restart and enter number between 1&3
        }}
      else if (parkChoice == 2){
        System.out.println("You decide to go to the Natural Area near your home. While you are there, you can:");
        System.out.println(" 1. Go Swimming in the lake \n 2. Go for a walk around the lake \n 3. Go for a kayak across the lake");
        // Users input selects an option that satisfies the if (input = 1, etc.)
        int naturalAreaChoice = input.nextInt();
        
        if (naturalAreaChoice ==1 ){
          System.out.println("You go swimming in the lake. Since it is a warm day, it helps you cool off.");
        }
        else if(naturalAreaChoice == 2){
          System.out.println("You go for a 5 mile walk around the lake. You feel very accomplished.");
        }
        else if(naturalAreaChoice == 3){
          System.out.println("You kayak across the lake. You reach the other side and feel very accomplished.");
        }
        else{
          System.out.println("You entered an invalid input. Please enter a number between 1&3.");
          // Tell user to restart and enter number between 1&3
        }}
        
      else if (parkChoice == 3){
        System.out.println("You decide to go to a National Park. What do you do there?");
        System.out.println(" 1. Go for a walk around the lake at the park \n 2. Go To the Visitor Center \n 3. Go on a tour of the park.");
        int nationalParkChoice = input.nextInt();
        // Users input selects an option that satisfies the if (input = 1, etc.)
        if (nationalParkChoice == 1){
          System.out.println("You decide to go for a walk around the lake in the park. The walk offers great views of the park and you return to the trailhead happy.");
        }
        else if(nationalParkChoice == 2){
          System.out.println("You decide to go to the vistor center of the park in order to learn more about it. You spend some time talking to a ranger and going through the displays.");
        }
        else if(nationalParkChoice == 3){
          System.out.println("You go on a tour of the park with a ranger and see great views of the lake and the mountains.");
        }
        else{
          System.out.println("You entered an invalid input. Please enter a number between 1&3.");
          // Tell user to restart and enter number between 1&3
        }}
        
    else if (wakeupChoice == 3){
        
        System.out.println("You decide to go for a drive. Where would you like to go?");
        System.out.println(" 1. Go to a fast food restruant in order to eat some Lunch \n 2. Go to Old world Wisconsin \3. Go to Elegant Farmer");
        int placeChoice = input.nextInt();
      
        if (placeChoice == 1){
          System.out.println("You choose to go for a drive into town and go to a fast food place. What fast food place would you like to go to?");
          System.out.println(" 1. Go to Culvers \n 2. Go to McDonalds \n 3. Go to Quick Trip");
          int fastFoodChoice = input.nextInt();
          // Users input selects an option that satisfies the if (input = 1, etc.)
          if (fastFoodChoice == 1){
            System.out.println("You go to Culvers and eat a butterburger and a ice cream. It tastes great.");
          }
          else if (fastFoodChoice == 2){
            System.out.println("You go to McDonalds and eat a Happy Meal and a shake.");
          }
          else if (fastFoodChoice == 3){
            System.out.println("You go to Quick trip and eat a hot dog and soda.");
          }
          else{
            System.out.println("You entered an invalid input. Please enter a number between 1&3.");
            // Tell user to restart and enter number between 1&3
          }}
          
        else if (placeChoice == 2){
          System.out.println("You decide to go to Old World Wisconsin. While you are there, you:");
          System.out.println(" 1. Watch a rope- making demonstration \n 2.Watch a bread making demonstration \n 3. Watch a Blacksmithing demonstration");
          int oldWorldWisconsinChoice = input.nextInt();

          if (oldWorldWisconsinChoice == 1){
            System.out.println("You decide to watch a rope making demonstration. It is very intresting and you end up with some rope to show for it.");
          }
          else if (oldWorldWisconsinChoice == 2){
            System.out.println("You decide to watch a bread making demonstration. It is very informative and you learn a lot about making bread.");
          }
          else if (oldWorldWisconsinChoice ==3){
            System.out.println("You watch a blacksmithing demonstration. It is very informative and you learn a lot about blacksmithing during this time period.");
          }
          else{
            System.out.println("You entered an invalid input. Please enter a number between 1&3.");
            // Tell user to restart and enter number between 1&3
          }}
          
        else if (placeChoice == 3){
          System.out.println("")
          
        }
        else{}
        }
           
    }

    else{
      
    }
  
        
      

  }

}