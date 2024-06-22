package BASIC.Recursion;

public class recursion {

    public static void recurse(int num)
    {
        // if(num >10)
        // {
        //     return;
        // }
        // System.out.println(num);
        // recurse(num+1);

        if(num<0)
        {
            return;
        }
        System.out.println(num);
        recurse(num-1);

    }
    public static void main(String[]args)
    {
        int num = 10;
        recurse(num);
        
    }
    
}

// in order to stop recursion we write base case;