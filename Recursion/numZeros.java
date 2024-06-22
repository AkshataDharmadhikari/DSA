package BASIC.Recursion;

public class numZeros {

    public static void main(String[] args) {
        int number = 0;
        System.out.println("Number of zeros in the Integer " + number + " : " + findZeros(number));
    }

    public static int findZeros(int n) {
        // If the number is 0, it has one zero digit
        if (n == 0) {
            return 1;
        }
        return findZerosHelper(n, 0);
    }

    private static int findZerosHelper(int n, int count) {
        // Base case: If n is 0, return the count
        if (n == 0) {
            return count;
        }
        
        // Check the last digit of n
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }
        
        // Recursive call with the next digit
        return findZerosHelper(n / 10, count);
    }
}
