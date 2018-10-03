// Name: ACHARYA, SULOCHAN Date Assigned: 12th March
//
// Course: CSCI 2003 63794 Date Due: 22nd March
//
// Instructor: Ms. Greer
//
// File name: GameController.java
//
// Program Description: This program controls the game class.
//                      Creates new game object.
//                      Takes two player names and asks who want to go first.
//                      Loops the whole game until players dont want to play again.
//                      Runs the game class and displays the result(winner or draw).
//                      Asks user if they want to play again.>

//importing Scanner class
import java.util.Scanner;

//creating class
public class GameController
{
   //creating main method
   public static void main(String[] args)
   {
      //creating scanner object
      Scanner stdin = new Scanner(System.in);
      
      //declaring a boolean variable that controls how many times players want to play the game
      boolean gameLoop = true;
      
      //creating temporary game object to display tutorial
      Game temporaryGame1 = new Game();
      
      //displaying a header
      System.out.println(" _______ _          _______             _______");             
      System.out.println("|__   __(_)        |__   __|           |__   __|");       
      System.out.println("   | |   _  ___ ______| | __ _  ___ ______| | ___   ___"); 
      System.out.println("   | |  | |/ __|______| |/ _` |/ __|______| |/ _ \\ / _ \\");
      System.out.println("   | |  | | (__       | | (_| | (__       | | (_) |  __/");
      System.out.println("   |_|  |_|\\___|      |_|\\__,_|\\___|      |_|\\___/ \\___|");
      System.out.println();
      System.out.println("Hello! This is tic tac toe game");
      System.out.println("Two players can play this game by filling in circle or cross on each grid.");
      System.out.println("There are total 9 grid elements which can be filled.");
      System.out.println("Each player has to fill the grid in alternation.");
      System.out.println("Whoever gets their symbol(O or X) three in a row wins.");
      System.out.println("Three in a row can be horizontal, vertical or diagonal.");
      System.out.println("If neither players get three in a row after all grid elements are occupied then game will be a draw.");
      System.out.println("Below is the grid on the left side and grid numbers on the right side.");
      System.out.println("To fill in a grid, player can enter corresponding number of the grid element.");
      //using temporary game object to display tutorial
      temporaryGame1.displayTable();
      
      
                 
      //asking user for two player names
      System.out.print("\n\nEnter 1st player's name: ");
      String name1 = stdin.nextLine();
      System.out.print("Enter 2nd player's name: ");
      String name2 = stdin.nextLine();
      
      //this loop runs until players want to play again
      //start of the game
      while(gameLoop)
      {
         //asking who want to play first
         System.out.print("\nWho wants to go first?");
         System.out.print("\n1. "+name1);
         System.out.print("\n2. "+name2);
         System.out.print("\n\nChoose your option (1-2): ");
         int choice = stdin.nextInt();
         
         //input validation
         while (choice != 1 && choice != 2)
         {
            System.out.print("\nERROR! Who wants to go first?");
            System.out.print("\n1. "+name1);
            System.out.print("\n2. "+name2);
            System.out.print("\n\nChoose your option (1-2): ");
            choice = stdin.nextInt();
         }
         
         //creating a new Game object
         Game game1 = new Game();
         
         //setting instance variables for player 1 and player 2
         if(choice == 1)
         {
            game1.setPlayer1(name1);
            game1.setPlayer2(name2);
         }
         //setting instance variables for player 2 and player 1
         else
         {
            game1.setPlayer1(name2);
            game1.setPlayer2(name1);
         }  
         
         //displaying information
         System.out.print("\n" + game1.getPlayer1() + " is Circle(O)");
         System.out.println("\n" + game1.getPlayer2() + " is Cross(X)\n\n");
         
         //declaring turn variable that decides whose turn is it to play
         //player1's turn if turn is odd, player2's turn if turn is even
         int turn = 1; 
         
         //displaying current game progress
         game1.displayTable();
           
         //running game until there is a winner or until all the spaces are occupied
         while(game1.checkWinner() == "None" && turn!=10)
         {
            
            //checking turn of the player
            if (turn%2 != 0)
            {
               System.out.print("\n\nIts "+game1.getPlayer1()+"'s turn. (O)");
            }
            else
            {
               System.out.print("\n\nIts "+game1.getPlayer2()+"'s turn. (X)");
            }        
                     
            //prompt for use to enter choice
            System.out.print("\nEnter one of the choice(1-9): ");
            choice = stdin.nextInt();
            
            //input validation (choice must be between 1 to 9 and should not be any occupied space)
            while(choice <1 || choice>9 || game1.getValue(choice) == 1 || game1.getValue(choice) ==2)
            {
               System.out.print("\nERROR! Enter one of the choice(1-9): ");
               choice = stdin.nextInt();
            }
            
            //setting the value of the space according to player turn
            if(turn%2!=0)
            {
               //setting the value as O
               game1.setValueOfCircle(choice);
            }
            else
            {
               //setting the value as X              
               game1.setValueOfCross(choice);
            }
            
            //display the progress of game
            game1.displayTable();
            System.out.println("\n");
            
            //increasing turn variable by one
            turn++;      
         }
         
         //check who is the winner
         //print the winner using toString method
         if(game1.checkWinner() == "O")
         {
            game1.setWinner(game1.getPlayer1());
            System.out.print(game1);
            
         }
         //check who is the winner
         //print the winner using toString method
         else if(game1.checkWinner() == "X")
         {
            game1.setWinner(game1.getPlayer2());
            System.out.print(game1);
            
         }
         //checking if the game is draw
         else if(turn == 10)
         {
            System.out.println("\nDraw");
            
         }
         //asking user if they want to play again
         System.out.print("Want to play again? (y/n): ");
         //clearing the buffer
         stdin.nextLine();
         //taking input
         String playAgain = stdin.nextLine();
         //input validation
         while(!playAgain.equals("y") && !playAgain.equals("n"))
         {
            System.out.print("Error! Want to play again? (y/n): ");
            playAgain = stdin.nextLine();
         }
         
         //setting gameLoop to true if they want to play again
         if(playAgain.equals("y"))
         {
            gameLoop = true;
         }
         //setting gameLoop to false if they dont want to play again
         else
         {
            gameLoop = false;
            System.out.print("\nThank you!");
         }
      }        
   }
}