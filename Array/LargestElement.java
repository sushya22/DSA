package Array;

import java.util.Arrays;

public class LargestElement {

    public static void findLargest(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
    public static void main(String args[]){
        int[] arr = new int[] {1,3,5,7,9,2,4,6,8,0};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        findLargest(arr);
    }
}
