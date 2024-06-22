package BASIC.Recursion;

public class Test2 {
    public static void main(String[]args)
    {
        int n = 0;
       printstring("Hello World", n);
       
    }
    public static void printstring(String str , int n)
    {
        if(n == 5)
        {
            return;
        }
        System.out.println(str);
        n = n + 1;
        printstring(str, n);

    }
    
}
