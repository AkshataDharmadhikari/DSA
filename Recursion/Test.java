package BASIC.Recursion;

public class Test {
    public static void main(String[]args)
    {
       int n = 5674;
       System.out.println(sumofdigit(n));
    }

    public static int sumofdigit(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        int rem = n % 10;
        n = n / 10;
        int sum  = rem + sumofdigit(n);
        return sum;
        
        
    }
    
}
