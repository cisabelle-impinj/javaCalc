
/**
 * Write a description of class mathApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;

public class mathApp
{
    static Scanner userInput = new Scanner(System.in);
    
    /**
     * Constructor for objects of class helloWorld
     */
    public mathApp()
    {
        // initialise instance variables
    }

    public static void fibonacciSequence(int max)
    {
        //sequence starts with 0, 1 with each subsequent number being the sum of the previous 2 numbers. (ex 0, 1, 1, 2, 3, 5, 8, 13, 21, ...)
        int nMinus2 = 0;
        int nMinus1 = 1;
        int n = 0;
        while(n <= max)
        {
            System.out.printf("%d\n", n);
            nMinus2 = nMinus1;
            nMinus1 = n;
            n = nMinus1 + nMinus2;
        }   
    }
    
    public static int binaryMultiplication(int x, int y)
    {
        int ans = 0;
        while (x != 0)
        {
            ans += ((x & 1)==1) ? y : 0;
            x = x >> 1;
            y = y << 1;
        }
        return ans;
    }
    
    public static String getUserInput(String userPrompt)
    {
       System.out.print(userPrompt + ": ");
       if(userInput.hasNextLine())
       {
          return(userInput.nextLine());
       }
       return("");
    }
       
    public static void main(String[] args)
    {
        mathApp hInstance = new mathApp();
            int x = 191;
            int y = 348;
            int ans = 0;
            String menuSelection;

            do{

                for(int numLF=0;   numLF<40; numLF++) {System.out.println("");}
    
                System.out.println("~~~~~~~~~~~~ Main Menu ~~~~~~~~~~~~");
                System.out.println("1 >> binaryMultiplication");
                System.out.println("2 >> fibonacciSequence");
                System.out.println("Q >> Quit");
                System.out.println("");

                menuSelection = getUserInput("Enter selection").toLowerCase();
                
                switch (menuSelection)
                {
                    case("1"): 
                        {
                            x = Integer.parseInt(getUserInput("Enter x"));
                            y = Integer.parseInt(getUserInput("Enter y"));
                            ans = binaryMultiplication(x, y);
                            System.out.println("");
                            System.out.println(x + " x " + y + " = " + ans);
                            break;
                        }
                    case("2"):
                        {
                            x = Integer.parseInt(getUserInput("Enter max"));
                            System.out.println("Fibonacci sequence to " + x + " MAX");
                            fibonacciSequence(x);
                            System.out.println("");
                            break;
                        }
                }
                menuSelection = getUserInput("continue? (or q to quit)").toLowerCase();
            }while (!menuSelection.startsWith("q"));
            
            ans=hInstance.binaryMultiplication(x, y);
            System.out.printf("%d * %d = %d%n", x, y, ans);
        
    }
}
