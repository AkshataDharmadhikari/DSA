package BASIC.Recursion;

public class LinearS {
    public static void main(String[]args)
    {
        int [] arr = {1,2,3,4,5,6,7,8};
        int Target = 8;
        System.out.println(linearSearch(arr,Target,0));
    }

    public static boolean linearSearch(int[]arr,int Target,int index)
    {
        if(Target!=arr[index] && index == arr.length-1)
        {
            return false;
        }
        if(Target == arr[index])
        {
            System.out.println("Found The element:"+arr[index]);
            return true;
        }
        return linearSearch(arr, Target, index+1);
    }
}
