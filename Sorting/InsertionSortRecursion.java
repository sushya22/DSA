package Sorting;

public class InsertionSortRecursion {

    public static void recursionsort(int[] arr,int index)
    {
        if(index<=arr.length-1)
        {   
            int j = index;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            recursionsort(arr,index+1);

        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,3,5,7,9,2,4,6,8,0};
        recursionsort(arr,0);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
