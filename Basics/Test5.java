public class Test5{
    public static void main(String[]args)
    {
        int [] arr = {1,2,3,4,5};
        printarray(arr);
        reverseArray(arr);
        printarray(arr);
     }
    public static void reverseArray(int[] arr)
    {
        int n = arr.length-1;
        int start = 0;
        while(start<n)
        {
            int temp = arr[start];
            arr[start] = arr[n];
            arr[n] = temp;

            start++;
            n--;
        }
    }

    public static void printarray(int[]arr)
    {
        for(int i:arr)
        {
            System.out.print(i);
        }
        System.out.println();
    }
}