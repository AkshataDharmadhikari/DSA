import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) 
    {
     // Write your code here
     
     int n = arr.size();
     List<Integer> rotatedArr = new ArrayList<>(n);
     
     for (int i = 0; i < n; i++) {
         rotatedArr.add(arr.get((i + d) % n));
     }
     
     return rotatedArr;
 }
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer> rotatedNumbers = rotateLeft(2, numbers);
        System.out.println(rotatedNumbers);

      

}
}
