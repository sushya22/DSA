package BinarySearch;

import java.util.Scanner;

public class FindLastOccurence {

    public static int findLastOccurence(int[] arr,int n)
    {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==n)
            {
                ans = mid;
                left = mid + 1;
            }
            else if(arr[mid]<n)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
      int[] arr = new int[]{3,4,13,13,13,20,40};
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(findLastOccurence(arr,n));
    }
}
