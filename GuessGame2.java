import java.util.Scanner;
public class GuessGame2
{
    
    public static void main(String[] args)
    {
         Scanner keyboard = new Scanner(System.in);

         int apple;
         int box=11;
         int count=1;
         String again;

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("This is the GuessGame2 go ahead and type in a number that is between 0-51");
            System.out.println("-------------------------------------------------------------------------");
                apple=keyboard.nextInt();
                 do{   
                   while(box!=apple) 
                   {
                    if(box<11)
                    {
                        System.out.println("Too low guillermo");
                    }
                    else if(box>11)
                    {
                        System.out.println("to high your dumb");
                    }
                        count++;

                    System.out.print("go again you failure");
                    apple=keyboard.nextInt();
                   }
                    System.out.println("sure it took you " + count + " tries ");

                    if(count > 5)
                        {
                            System.out.println("good stuff m8");
                        }
                    else if(count > 10)
                        {
                            System.out.println("ehhhh your trash jajajajaja");
                        }

                    else
                        {
                           
                            System.out.println("ok now your just like guillermo, just plain dumb");
                          }

                          System.out.println("play again and conquer ny highscore which is zero!!!!");
                            again=keyboard.next();
                            
                 }while(again.equals("yes"));
                    















    }
}