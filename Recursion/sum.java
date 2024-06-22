package BASIC.Recursion;

public class sum {

    public static void sumofnum(int num, int sum)
    {
          
           if(num < 0)
           {
              return;
           }
            sum = sum * num;
            sumofnum(num - 1,sum);
            System.out.println(sum);
           
    }
       
    public static void main(String[]args)
    {
        int num = 5;
        sumofnum(num,1);
    }
}
