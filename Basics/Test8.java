import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("abc");
        stringList.add("ab");
        System.out.println(stringList);
        List<String> queries =  new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        System.out.println(queries);
        List<Integer> result = matchingStrings(stringList, queries);
        System.out.println(result); // Output: [2, 0, 2]
    }
     public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    // Write your code here
       List<Integer> newNum = new ArrayList<>();
       int count = 0;
       for(int i = 0; i < queries.size(); i++) {
        newNum.add(0);
    }

       for(int i=0;i<queries.size();i++)
       {
          for(int j=0;j<stringList.size();j++)
          {
            if(queries.get(i).compareTo(stringList.get(j)) == 0)
            {
               newNum.set(i, newNum.get(i) + 1);
            }
          }
       }
       return newNum;

    }
}
