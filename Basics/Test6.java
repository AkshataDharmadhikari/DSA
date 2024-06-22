import java.util.ArrayList;
import java.util.List;
public class Test6 {
    public static void main(String[]args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
       int start = 0;
       int end = numbers.size()-1;
       while(start<end)
       {
          int temp = numbers.get(start);
          int endnum= numbers.get(end);
          numbers.set(start,endnum);
          numbers.set(end, temp);

          start++;
          end--;
       }

       System.out.println(numbers);
    }
    
}
