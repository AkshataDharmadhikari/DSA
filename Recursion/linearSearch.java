package BASIC.Recursion;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = { 6 };
        int target = 9;
        System.out.println(Lsearch(arr, target, 0));
    }

    public static boolean Lsearch(int[] arr, int target, int index) {
        if (index == arr.length - 1 && arr[index] != target) {
            return false;
        }
        if (target == arr[index]) {
            return true;
        }
        return Lsearch(arr, target, index + 1);

        // return arr[index] == target || Lsearch(arr,target,index+1) one line code 
    }

}
