package BASIC.Recursion;

public class pattern {

    public static void main(String[]args)
    {
        // patternStar();
        patternStar2(5, 0);
        patternstar3(5, 0);
    }
    
    // public static void patternStar()
    // {
    //     for(int i=0;i<=5;i++)
    //     {
    //         for(int j=5;j>i;j--)
    //         {
    //             System.out.print("*");
    //         }
    //         System.err.println();
    //     }
        
    // }

    public static void patternstar3(int r , int c)
    {
        if(r == 0)
        {
            return;
        }
        if(c< r)
        {
            patternstar3(r, c+1);
            System.out.print("*");
        }
        else{
            patternstar3(r-1, 0);
            System.out.println();


        }
    }

    public static void patternStar2(int i, int j) {
        if (i == 0) {
            return;  // Base case: No more rows to print
        }
        
       patternStarInner(i);
       System.out.println();
       patternStar2(i-1, j);
    }

    // Inner function to print stars for a given row
    public static void patternStarInner(int n) {
        if(n == 0)
        {
            return;
        }
        System.out.print("*");
        patternStarInner(n-1);
       
    }
}


