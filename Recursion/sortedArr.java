package BASIC.Recursion;

public class sortedArr {

    public static void main(String[]args)
    {
        int [] arr = {1,3,2,5,6,7,8,9,10};
       System.out.println(isSorted(arr,0));

    }
    public static boolean isSorted(int [] arr,int index)
    {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
}
}