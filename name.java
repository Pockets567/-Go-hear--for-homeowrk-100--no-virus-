import java.util.Scanner;


public class name
{
    public static void main(String[] args)
    {
          Scanner keyboard = new Scanner(System.in);
       String a;
       String b= "joe";
       String c= "bob"; 
        
    
        System.out.println("what is your favorite name");
        a=keyboard.next();

        if(a.equals(b))
        {
            System.out.println("that is my first favorite name");
        }
        
        else if(a.equals(c))
        {
            System.out.println("that is my second favorite name");
        }

    else
    {
        System.out.println("what type of cool name is that.");
        System.out.println("pathetic child");
    }














    }
}