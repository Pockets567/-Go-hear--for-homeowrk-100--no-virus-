import java.util.Scanner;


public class between
{
    public static void main(String[] args)
    {
          Scanner keyboard = new Scanner(System.in);
       int a; 
        System.out.println("type in a number between 15 and 23");

        a=keyboard.nextInt();

        if(a>=15 && a<=23)
        {
            System.out.println("you got it");
        }

        else 
        {
            System.out.println("no");
        }
















    }
}