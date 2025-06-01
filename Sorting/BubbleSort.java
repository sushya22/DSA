package Sorting;

public class BubbleSort {

    public static void bubblesort(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            boolean swap = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

                if(!swap)
                {
                   break;
                }
            }
        }

        
    }
    public static void main(String[] args){
        int[] arr = new int[] {0,1,2,3,4,5,67,89};
        bubblesort(arr);
        for(int i:arr)
        {
           System.out.println(i);
        }
    }
}
