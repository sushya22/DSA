package Sorting;

public class BubbleSortRecursion {
    public static void recursionsort(int[] arr,int left,int right)
    {
        if(left<right){
            for(int i=0;i<arr.length-1;i++)
            {
              if(arr[i]>arr[i+1])
              {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
              }
            }
            recursionsort(arr, left, right-1);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,3,5,7,9,2,4,6,8,0};
        recursionsort(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
