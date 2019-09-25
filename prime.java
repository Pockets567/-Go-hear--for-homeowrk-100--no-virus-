import java.util.Scanner;
public class prime
{
    public static void main(String[] args)
    

    {
        Scanner keyboard = new Scanner(System.in);
        int num;
        
        boolean prime= true;
            System.out.println("Give me a number and ill telll you if iit isss prime");
        num=keyboard.nextInt();
        
            
            for(int i=2;i<num;i++)
            {
            if(num% i ==0)
            {
                prime=false;
               
            }
            }
            if(prime)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("it is not prime you fool");
            }

        




    }
}




