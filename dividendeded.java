
import java.util.Scanner;


public class numbers
{
    public static void main(String[] args)
    {
          Scanner keyboard = new Scanner(System.in);
        int aidan;
        int calvin;
        String operator;
        
        System.out.println("Please give me a number:");
        aidan = keyboard.nextInt();
        System.out.println("Type in your Operator( +, -, *, /,)");
        operator = keyboard.next();
        System.out.println("PLease give me a second number");
         calvin = keyboard.nextInt();
         System.out.println("wow thank you, very cool");
         System.out.println("this is so epic");

     if(icon.equals("+"))
    {
     System.out.printf("%d+%d=%d\n",aidan,calvin,aidan+calvin);
     if(icon.equals("-"))
     {
      System.out.printf("%d-%d=%d\n", aidan,calvin,aidan-calvin);
     }
      if(icon.equals("*"))
      {
        System.out.printf("%d*%d=%d\n",aidan,calvin,aidan*calvin);
      }   
     if(icon.equals("%"))
     {
        System.out.printf("%d/%d=%d\n",aidan,calvin,aidan/calvin);
     }    
        
         
    }
}