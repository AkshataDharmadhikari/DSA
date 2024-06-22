


public class Test4 {

    public static void main(String[] args) {
        
        int[] arr = {2,3,6,7,8,1,4,5};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
       
    }
    public static void bubbleSort(int[]arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j =0;j<arr.length-i-1;j++)
            {
                
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        }
         
    }
    
}
