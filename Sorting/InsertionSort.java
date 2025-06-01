package Sorting;

public class InsertionSort {

    public static void insertionsort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int j = i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args)
    {   
        int[] arr = new int[]{1,3,5,7,9,2,4,6,8,0};
        insertionsort(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
