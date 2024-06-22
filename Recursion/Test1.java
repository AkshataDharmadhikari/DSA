package BASIC.Recursion;

public class Test1 {

    public static void main(String[]args)
    {
        printnum(1);
    }
    public static void printnum(int n)
    {
        if (n == 10)
        {
            return;
        }
       System.out.println(n);
       n = n + 1;
       printnum(n);

    }
    
}
