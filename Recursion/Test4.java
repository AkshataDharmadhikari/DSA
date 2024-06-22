package BASIC.Recursion;

public class Test4 {
    public static void main(String[]args)
    {
         System.out.println(factorial(5));
    }

    public static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
    
}
