package BinarySearch;

import java.util.Scanner;

public class SearchRotatedSortedArray {

    public static int findIndex(int[] arr, int n)
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
                break;
            }

            if(arr[left]==arr[mid] && arr[mid]==arr[right])
            {
                left++;
                right--;
            }
            
            if(arr[left]<=arr[mid])
            {
                if(arr[left]<=n && n<=arr[mid])
                {
                    right = mid -1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            else
            {
                if(arr[mid]<=n && n<=arr[right])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findIndex(arr,n));

    }
}
