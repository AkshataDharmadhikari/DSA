package BASIC.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in array");
        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            list.add(input);
        }
        int target = 4;
        ArrayList<Integer> result = findElement(list, target, 0);
        if (result != null) {
            System.out.println("Target and its index: [" + result.get(0) + ", " + result.get(1) + "]");
        } else {
            System.out.println("Target not found");
        }
        sc.close();
    }

    public static ArrayList<Integer> findElement(ArrayList<Integer> list, int target, int index) {
        if (index == list.size()) {
            return null; // Target not found
        }

        if (target == list.get(index)) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(target);
            result.add(index);
            return result;
        }
        return findElement(list, target, index + 1);

    }
}
