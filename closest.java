import java.util.Scanner;
public class closest
{
    
    public static void main(String[] args)
    {
         Scanner keyboard = new Scanner(System.in);
        int a;
        int b;
        int orig;
        int inal;
        

            System.out.println("give me a number ");
        
         a=keyboard.nextInt();

            System.out.println("give me another number");

        b=keyboard.nextInt();
        orig = a;
        inal = b;

         if(a<0)
    {
        a*=-1;
        System.out.println("dont even play these games with me");
    }
       else if(b>0)
    {
        a*=-1;
        System.out.println("dont even play these games with me");
    }

    if(a<b)
    {
      System.out.printf(orig + " is closer to 0");  
    }

    else if(a>b)
    {
        System.out.printf(inal+ " is closer to 0");
    }
   










  
        
    }
}