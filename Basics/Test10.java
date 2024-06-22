public class Test10 {
public static void InsertionSort(int[]arr)
    {
      
        int n = arr.length-1;
        
        for(int i=1; i<n; i++)
        {
              int j = i-1;
              int current = arr[i];
              while(j>=0 && current<arr[j])
              {
                 arr[j+1] = arr[j];
                 j--;
              }
              arr[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,6,7,1,8};
        InsertionSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
