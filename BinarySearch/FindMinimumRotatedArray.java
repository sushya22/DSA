package BinarySearch;

import java.util.Scanner;

public class FindMinimumRotatedArray {

    public static int findMinimum(int[] arr)
    {
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            
            if(arr[left]<=arr[mid])
            {   
                ans = Math.min(ans,arr[left]);
                left = mid + 1;
            }
            else
            {   
                ans = Math.min(ans,arr[mid]);
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
      int[] arr = new int[]{4,5,6,7,0,1,2,3};
      Scanner sc = new Scanner(System.in);
      System.out.println(findMinimum(arr));
    }
}
