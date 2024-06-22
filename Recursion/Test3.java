package BASIC.Recursion;

public class Test3 {

    public static void main(String[]aStrings)
    {
        funRev(5);
        System.out.println("-------------");
        fun(5);

    }

    public static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
        
    }
    public static void funRev(int n)
    {
        if(n==0)
        {
            return;
        }
        funRev(n-1);
        System.out.println(n);
        
    }
    
}
