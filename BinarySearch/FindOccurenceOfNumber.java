package BinarySearch;

import java.util.Scanner;

public class FindOccurenceOfNumber {

    public static int findFirstOccurence(int[] arr,int n)
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
                right = mid - 1;
            }
            else if(arr[mid]>n)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return ans;
    }

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
            else if(arr[mid]>n)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 2 , 3 , 3 , 3 , 3 , 4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstOccurence = findFirstOccurence(arr, n);
        int lastOccurence = findLastOccurence(arr,n);
        System.out.println(lastOccurence - firstOccurence + 1);
    }
}
