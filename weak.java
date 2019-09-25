import java.util.Scanner;


public class weak
{
    public static void main(String[] args)
    {
          Scanner keyboard = new Scanner(System.in);
        int day;


        System.out.println("Give me a number and I shall give you the day fo the week.");
    day=keyboard.nextInt();
    
    if(day==1)
    {
        System.out.println("day one is sunday");
    }

    else if(day==2)
    {
        System.out.println("day two is monday");
    }
     else if(day==3)
    {
        System.out.println("day three is tuesday");
    }
    else if(day==4)
    {
        System.out.println("day FOUR is wednesday");
    }
      else if(day==5)
    {
        System.out.println("day five is thursday");
    }
      else if(day==6)
    {
        System.out.println("day six is friday");
    }
      else if(day==7)
    {
        System.out.println("day seven is saturday");
    }

    if( day==1 || day==7)
        {
            System.out.println(" It is the weekend");
        }
    else if(day<1 && day >7 )
    {
        System.out.println("The Weekdays");
    }

    else 
        {
            System.out.print("why would you even try to break this you dumb head");
        }










    }
}