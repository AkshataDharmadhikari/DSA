

public class Test3 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        if((n & bitmask) == 0)
        {
            System.out.println(" bit at "+ pos +" was: "+ "zero");
        }else{
            System.out.println("bit was one");
        }
        // set the 3rd bit of number 0101 means add 1 ;bitmask = 1<<pos; or operation
        int newnumber  = n | bitmask;
        System.out.println(newnumber);

         // clear the 3rd bit of number number 0101  1<<pos;  AND with Not operation of bit mask
         // Take not using ~
         int not = ~bitmask;
         int newnum = n & not;
         System.out.println(newnum);

         //update operation ; update to 0 then clear op; updt to 1 then set operation


         
    }
   

    
}
