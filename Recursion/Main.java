package BASIC.Recursion;
public class Main{
    public static void main(String[]args)
    {
       int []arr = {1,2,3,4,5,6,7,8,9,10};
       int start = 1;
       int end = 10;
       int target = 7;
       
       System.out.println(Search(arr, target, start, end));
    }

    static int Search(int [] arr, int target, int start, int end){
       if(start>end)
       {
         return -1;
       }
       int m = start + (end -start)/2;
       if(target == arr[m]){
         return m;
       }
       if(target< arr[m])
       {
         return Search(arr, target, start, m-1);
       }
      return Search(arr, target, m+1, end);


      

       
    }
    
    
}