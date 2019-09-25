/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Aidan Mallory
   Date Due:   9/11/2019
 ******************************************************************************/

import java.util.Scanner;
public class GuessGame
{
    
    public static void main(String[] args)
    {
         Scanner keyboard = new Scanner(System.in);
        int guess;
        int b=29;
    
    
         System.out.println("Welcome to Aidan Mallorys GuessGame");
         System.out.println("please pick a number between 1 and 50");
         guess=keyboard.nextInt();
while(guess!=b)
    {
        if(guess  > b)
        {
          System.out.println("to high...have you heard of joe...if you haven't go ahead and ask aidan mallory who joe is");
        }

        else 
        {
          System.out.println("to low dumb head");
        }
        guess=keyboard.nextInt();    
    }




    System.out.println("good job you got it");








    













    








        
        
    }
}
