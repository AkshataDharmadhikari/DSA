package Recursion;
// Print numbers 1 - 5
public class Test1 {

    // public static void printNumbers(int num)
    // {   if(num == 6)
    //     {
    //         return;
    //     }
    //     System.out.println(num);
    //     printNumbers(num+1);
    // }

    public static void printNumbersD(int num)
    {   if(num == 0) // num = 8;
        {
            return;
        }
        printNumbersD(num-1);
        System.out.println("Printing Numbers:"+ num); // because of first in first out we will print numbers in ascending order
    }

    // public static int Factorial(int num,int fact)
    // {
        
    //    if(num == 0)
    //    {
    //       return fact;
    //    }
    //    return Factorial(num-1, fact * num);

    // }

    public static void main(String [] args)
    {
        int num = 1;
        // printNumbers(num);
        printNumbersD(8);
    //   int result = Factorial(7,1);
    //   System.out.println(result);
      
    }
    
}
