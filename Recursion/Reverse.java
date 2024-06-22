package BASIC.Recursion;



public class Reverse {
 static int sum = 0;
    public static void reverse(int n)
    {
        if(n == 0)
        {
            return;
        }

        int rem =  n % 10;
        sum  = sum * 10 + rem;
        reverse(n/10);
        


    }
    public static void main(String[]args)
    {
        int n = 1271;
        reverse(n);
        System.out.println(sum);
        if(n == sum)
        {
            System.out.println(("The number is pallindrome"));
        }
        else{
            System.out.println("It is not a pallindrome");
        }
    }
    
  
}
