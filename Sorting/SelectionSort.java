package Sorting;

public class SelectionSort {
    public static void sortArray(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++)
        {   
            int minindex = i;
            for(int j=i+1;j<n;j++)
            {
               if(arr[j]<arr[minindex])
               {
                minindex = j;
               }
            }
            int temp =  arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        sortArray(new int[] {1,2,3,6,7,8,1,2,4,5});
    }
}
