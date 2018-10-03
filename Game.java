// Name: ACHARYA, SULOCHAN Date Assigned: 12th March
//
// Course: CSCI 2003 63794 Date Due: 22nd March
//
// Instructor: Ms. Greer
//
// File name: Game.java
//
// Program Description: This class creates a tic-tac-toe game session.
//                      This game is played by two players.                     
//                      Tic-tac-toe has 9 spaces to fill in which users can fill with Cross(X) or Circle(O).                      
//                      9 spaces are referred as grid elements in the program.                      
//                      This class stores and calculates all the necessary variables to run the game.
//                      This class also finds the winner(if there are any) in each round of the game.
//                      9 grid elements are referred as valueNum1, valueNum2, ..... ,valueNum9 
//                      This class also has methods to display current status of the game.>                    


/**
   Class to create a game session
*/


public class Game
{
   private String player1;
   private String player2;
   private String winner;
   private int valueNum1;
   private int valueNum2;
   private int valueNum3;
   private int valueNum4;
   private int valueNum5;
   private int valueNum6;
   private int valueNum7;
   private int valueNum8;
   private int valueNum9;
   
   
   /**
      Initializes the instance variables
   */
   //valueNum value = 0 means grid element not occupied
   //valueNum value = 1 means grid element has O character
   //valueNum value = 2 means grid element has X character
   //initializing valueNum# as 0 for beginning of the game
   public Game()
   {
      player1 = "Anonymous";
      player2 = "Anonymous";
      valueNum1=0;
      valueNum2=0;
      valueNum3=0;
      valueNum4=0;
      valueNum5=0;
      valueNum6=0;
      valueNum7=0;
      valueNum8=0;
      valueNum9=0;
      winner = "None";
   }
   
   /**
      Initializes the instance variables w/ user values
      @param n1 name of player 1
      @param a2 name of player2      
   */
   public Game(String n1, String n2)
   {
      player1 = n1;
      player2 = n2;
   }
   
   /**
      Sets the value of required grid element for circle(O).
      @param x grid element number.
   */
   public void setValueOfCircle(int x)
   {
      switch (x) {
         case 1: 
         valueNum1 = 1;
         break;
         
         case 2:
         valueNum2 = 1;
         break;
         
         case 3:
         valueNum3 = 1;
         break;
         
         case 4:
         valueNum4 = 1;
         break;
         
         case 5:
         valueNum5 = 1;
         break;
         
         case 6:
         valueNum6 = 1;
         break;
         
         case 7:
         valueNum7 = 1;
         break;
         
         case 8:
         valueNum8 = 1;
         break;
         
         case 9:
         valueNum9 = 1;
         break;
         }
      }
      
      /**
         Sets the value of required grid element for cross(X).
         @param x grid element number.
      */
      public void setValueOfCross(int x)
      {
         switch (x) {
            case 1: 
            valueNum1 = 2;
            break;
            
            case 2:
            valueNum2 = 2;
            break;
            
            case 3:
            valueNum3 = 2;
            break;
            
            case 4:
            valueNum4 = 2;
            break;
            
            case 5:
            valueNum5 = 2;
            break;
            
            case 6:
            valueNum6 = 2;
            break;
            
            case 7:
            valueNum7 = 2;
            break;
            
            case 8:
            valueNum8 = 2;
            break;
            
            case 9:
            valueNum9 = 2;
            break;
         }
      }
      
      /**
         Sets the name of player 1.
         @param n1 Name of player 1.
      */
      public void setPlayer1(String n1)
      {
         player1 = n1;
      }
      
      /**
         Sets the name of player 2.
         @param n2 Name of player 2.
      */
      public void setPlayer2(String n2)
      {
         player2 = n2;
      }
      
      /**
         Sets the name of the winner of the game.
         @param win Name of winner of the game.
      */
      public void setWinner(String win)
      {
         winner = win;
      }
      
      /**
         Returns name of player 1.
         @return Name of player 1.
      */
      public String getPlayer1()
      {
         return player1;
      }
      
      /**
         Returns name of player 2.
         @return Name of player 2.
      */
      public String getPlayer2()
      {
         return player2;
      }
      
      /**
         Returns name of the winner.
         @return Name of the winner.
      */
      public String getWinner()
      {
         return winner;
      }
      
      /**
         Returns grid element value of grid number 1 (valueNum1)
         @return Grid value of grid number 1. (valueNum1)
      */
      public int getValue1()
      {
         return valueNum1;
      }
      
      /**
         Returns grid element value of grid number 2 (valueNum2)
         @return Grid value of grid number 2. (valueNum2)
      */
      public int getValue2()
      {
         return valueNum2;
      }
      
      /**
         Returns grid element value of grid number 3 (valueNum3)
         @return Grid value of grid number 3. (valueNum3)
      */
      public int getValue3()
      {
         return valueNum3;
      }
      
      /**
         Returns grid element value of grid number 4 (valueNum4)
         @return Grid value of grid number 4. (valueNum4)
      */
      public int getValue4()
      {
         return valueNum4;
      }
      
      /**
         Returns grid element value of grid number 5 (valueNum5)
         @return Grid value of grid number 5. (valueNum5)
      */
      public int getValue5()
      {
         return valueNum5;
      }
      
      /**
         Returns grid element value of grid number 6 (valueNum6)
         @return Grid value of grid number 6.(valueNum6)
      */
      public int getValue6()
      {
         return valueNum6;
      }
      
      /**
         Returns grid element value of grid number 7 (valueNum7)
         @return Grid value of grid number 7. (valueNum7)
      */
      public int getValue7()
      {
         return valueNum7;
      }
      
      /**
         Returns grid element value of grid number 8 (valueNum8)
         @return Grid value of grid number 8. (valueNum8)
      */
      public int getValue8()
      {
         return valueNum8;
      }
      
      /**
         Returns grid element value of grid number 9 (valueNum9)
         @return Grid value of grid number 9. (valueNum9)
      */
      public int getValue9()
      {
         return valueNum9;
      }
      
      /**
         Returns grid element value of any grid number.
         @param pos grid number.
         @return Grid element value of given grid number.
      */
      public int getValue(int pos)
      {
         switch(pos) {
            case 1:
            return valueNum1;
            
            
            case 2:
            return valueNum2;
            
            
            case 3:
            return valueNum3;
            
            
            case 4:
            return valueNum4;
            
            
            case 5:
            return valueNum5;
            
            
            case 6:
            return valueNum6;
            
            
            case 7:
            return valueNum7;
            
            
            case 8:
            return valueNum8;
            
            
            case 9:
            return valueNum9;
            
            default:
            return 100;
            
         }
      }        
            
      
      /**
         Returns symbol of given grid element ( O or X ).
         @param number number of grid element.
         @return character of given grid element ( O or X ).
      */
      public String getCharValue(int number)
      {
         if (number == 1)
         {
            return "O";
         }
         else if (number == 2)
         {
            return "X";
         }
         else
         {
            return " ";
         }
      }
      
      /**
         Checks and returns win or draw (X or O or None) in each round.
         @return win or draw in each round.
      */
      public String checkWinner()
      {
         //declare winner as no one.
         String winner = "None";
         
         //calculating average of all the tab values horizontally (3 horizontal rows)
         double avrgHorizontal1 = (valueNum1+valueNum2+valueNum3)/3.0;
         double avrgHorizontal2 = (valueNum4+valueNum5+valueNum6)/3.0;
         double avrgHorizontal3 = (valueNum7+valueNum8+valueNum9)/3.0;
         
         //calculating average of all the tab values vertically (3 vertical columns)
         double avrgVertical1 = (valueNum1+valueNum4+valueNum7)/3.0;
         double avrgVertical2 = (valueNum2+valueNum5+valueNum8)/3.0;
         double avrgVertical3 = (valueNum3+valueNum6+valueNum9)/3.0;
         
         //calculating average of all the tab values diagonally (3 diagonal lines)
         double avrgDiagonal1 = (valueNum1+valueNum5+valueNum9)/3.0;
         double avrgDiagonal2 = (valueNum3+valueNum5+valueNum7)/3.0;
         
         
         //algorithm for checking the winner
         if (avrgHorizontal1 == 1.0)
         {
            if (valueNum1 == 1 && valueNum2 == 1 && valueNum3 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgHorizontal1 == 2.0)
         {
            winner = "X";
         }         
         if (avrgHorizontal2 == 1.0)
         {
            if (valueNum4 == 1 && valueNum5 == 1 && valueNum6 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgHorizontal2 == 2.0)
         {
            winner = "X";
         }
         if (avrgHorizontal3 == 1.0)
         {
            if (valueNum7 == 1 && valueNum8 == 1 && valueNum9 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgHorizontal3 == 2.0)
         {
            winner = "X";
         }
         if (avrgVertical1 == 1.0)
         {
            if (valueNum1 == 1 && valueNum4 == 1 && valueNum7 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgVertical1 == 2.0)
         {
            winner = "X";
         }
         if (avrgVertical2 == 1.0)
         {
            if (valueNum2 == 1 && valueNum5 == 1 && valueNum8 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgVertical2 == 2.0)
         {
            winner = "X";
         }
         if (avrgVertical3 == 1.0)
         {
            if (valueNum3 == 1 && valueNum6 == 1 && valueNum9 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgVertical3 == 2.0)
         {
            winner = "X";
         }
         if (avrgDiagonal1 == 1.0)
         {
            if (valueNum1 == 1 && valueNum5 == 1 && valueNum9 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgDiagonal1 == 2.0)
         {
            winner = "X";
         }
         if (avrgDiagonal2 == 1.0)
         {
            if (valueNum3 == 1 && valueNum5 == 1 && valueNum7 ==1)
            {
               winner = "O";
            }
         }
         else if(avrgDiagonal2 == 2.0)
         {
            winner = "X";
         }
         
         return winner;
         
      }
   
   
      /**
         Display the current status (grid and tutorial) of the game.
      */
   public void displayTable()
   {
      System.out.printf("%6s%6s%23s%6s%6s","|","|"," ","|","|");
      System.out.printf("\n%3s%3s%3s%3s%3s%20s%3s%3s%3s%3s%3s",getCharValue(valueNum1),"|",getCharValue(valueNum2),"|",getCharValue(valueNum3)," ","1","|","2","|","3");
      System.out.printf("\n%6s%6s%23s%6s%6s","|","|"," ","|","|");
      System.out.printf("\n-----------------%18s-----------------"," ");
      System.out.printf("\n%6s%6s%23s%6s%6s","|","|"," ","|","|");
      System.out.printf("\n%3s%3s%3s%3s%3s%20s%3s%3s%3s%3s%3s",getCharValue(valueNum4),"|",getCharValue(valueNum5),"|",getCharValue(valueNum6)," ","4","|","5","|","6");
      System.out.printf("\n%6s%6s%23s%6s%6s","|","|"," ","|","|");
      System.out.printf("\n-----------------%18s-----------------"," ");
      System.out.printf("\n%6s%6s%23s%6s%6s","|","|"," ","|","|");
      System.out.printf("\n%3s%3s%3s%3s%3s%20s%3s%3s%3s%3s%3s",getCharValue(valueNum7),"|",getCharValue(valueNum8),"|",getCharValue(valueNum9)," ","7","|","8","|","9");
      System.out.printf("\n%6s%6s%23s%6s%6s","|","|"," ","|","|");
   }
   
     /**
        Returns winner of the game with a text after completion of the game.     
        @return Winner of the game with a text after completion of the game.
     */
   public String toString()
   {
      
      
      return "Bravo! "+winner+" is the winner.\n";
      
   }
}
         
                  
               
        
          
           
            
            
            
            
      
      
                  
      
      

   
   
