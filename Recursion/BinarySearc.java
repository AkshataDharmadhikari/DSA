package BASIC.Recursion;

public class BinarySearc {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int Target = 8;
        int start = 0;
        int end = 10;
        boolean result = BinarySearch(arr, Target, start, end);
        System.out.println(result);
    }

    public static boolean BinarySearch(int[] arr, int Target, int start, int end) {

        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == Target) {
            return true;
        }
        if (Target < arr[mid]) {
            return BinarySearch(arr, Target, start, mid - 1);
        }
        if (Target > arr[mid]) {
            return BinarySearch(arr, Target, mid + 1, end);
        }
        return false;

    }
}
