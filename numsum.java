 import java.util.Scanner;
public class numsum
{
    
    public static void main(String[] args)
    {
         Scanner keyboard = new Scanner(System.in);

         int input;
         int count = 0;
         int sum = 0;
         int largest = 0;
         int small = 0;

         System.out.println("give me a positive number to keep the program running or a negative number to end it");
         input=keyboard.nextInt();

         while(input>0)
         {
             
             sum+=input;
             if(input<small || count==0)
             {
                 small=input;
             }
             if(input>largest)
             {
                 largest=input;
             }
             if(input<small)
             {
                small=input;
             }
             count++;
             System.out.println("give me a positive number to keep the program running oe a negative number to end it");
             input=keyboard.nextInt();
            
         }
if(count>0)
{
    System.out.println("The sum is" +sum);
    System.out.printf("it took you " + count + " tries to end it");
    System.out.printf("The largest number you gave me was %d\n", largest);
    System.out.printf("The smallest number you gave me was %d\n",small);
}



    }

}