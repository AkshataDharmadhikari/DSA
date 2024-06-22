package BASIC.Recursion;

public class Test5 {

    public static void main(String[]args)
    {
        fun(5);
    }
    public static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n--);
       
    }
    
}


// //n-- (Post-Decrement Operator)
// Effect:

// n-- is the post-decrement operator. It decreases the value of n by 1 after the current expression is evaluated.
// It changes the value of n.
// Usage:

// Commonly used when you need to decrement the value of n but use its current value in the expression.
// Example:

// java
// Copy code
// int n = 5;
// int a = n--; // a is assigned 5, then n is decremented to 4
// System.out.println("a: " + a); // Output: a: 5
// System.out.println("n: " + n); // Output: n: 4
// n - 1 (Subtraction Operation)
// Effect:

// n - 1 is a simple arithmetic operation that subtracts 1 from n but does not change the value of n.
// It does not modify the original value of n.
// Usage:

// Used when you need to compute the value of n minus 1 without changing the value of n.
// Example:

// java
// Copy code
// int n = 5;
// int a = n - 1; // a is assigned 4, n remains 5
// System.out.println("a: " + a); // Output: a: 4
// System.out.println("n: " + n); // Output: n: 5
// Summary:
// n--: Decrements n by 1 after the expression is evaluated and changes the value of n.
// n - 1: Computes n - 1 without changing the value of n.
