package BinarySearch;

import java.util.Scanner;

public class SpliArrayLargestSum {

    public static int findSubarrayCount(int[] arr,int n)
    {
        int count = 1;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]<=n)
            {
                sum+=arr[i];
            }
            else
            {
                count+=1;
                sum = arr[i];
            }
        }
        return count;
    }

    public static void findMaxSum(int[] arr,int k)
    {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i=0;i<arr.length;i++)
        {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        for(int i=start;i<=end;i++)
        {
            int noSubArray = findSubarrayCount(arr,i);
            if(noSubArray==k)
            {      
                System.out.println(i);
                break;
            }
        }
        
    }

    public static void findMaxSumOpt(int[] arr,int k)
    {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i=0;i<arr.length;i++)
        {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        int left = start;
        int right = end;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int noSubArray = findSubarrayCount(arr, mid);
            if(noSubArray>k)
            {
                left = mid+1;
                
            }
            else
            {
                right = mid - 1;
                ans = mid;
            }
        }

        System.out.println(left);

    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        findMaxSumOpt(arr,k);
    }
}
