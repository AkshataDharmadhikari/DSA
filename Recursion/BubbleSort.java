package BASIC.Recursion;

public class BubbleSort {
    public static void main(String[] args)
    {
        int [] arr = {1,6,5,3,8,9,10};
        SortBubble(arr,arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void SortBubble(int[] arr,int n)
    { 
        if(n==1)
        {
            return;
        }
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i]>arr[i+1])
           {
              int temp = arr[i];
              arr[i]=arr[i+1];
              arr[i+1] = temp;
           }
        }
        SortBubble(arr,n-1);
    }
   
}
