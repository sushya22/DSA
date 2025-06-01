package Sorting;

public class QuickSort {

    public static int partionarray(int[] arr,int left,int right)
    {
        int pivot = arr[left];
        int i = left;
        int j = right;
        while(i<j)
        {
            while(arr[i]<=pivot && i<right )
            {
                i++;
            }
            while(arr[j]>pivot && j>left)
            {
                j--;
            }
            
            if(i<j)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }

        int temp = arr[j];
        arr[j] = pivot;
        arr[left] = temp;
        return j;
    }

    public static void quicksort(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int partition = partionarray(arr,left,right);
            quicksort(arr,0,partition-1);
            quicksort(arr,partition+1, right);
        }
    }
    public static void main(String[] args)
    {   
        int[] arr = new int[] {1,3,5,7,9,2,4,6,8,0,10};
        quicksort(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
