package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static int findNoOfCows(int[] arr,int d)
    {
        int noCows = 1;
        int lastCowPosition = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-lastCowPosition>=d)
            {
                noCows+=1;
                lastCowPosition = arr[i];
            }
        }
        return noCows;
    }
    public static void findMinimumDistance(int[] arr,int k)
    {
        Arrays.sort(arr);
        int left = 1;
        int right = arr[arr.length-1]-arr[0];
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int noOfCows = findNoOfCows(arr,mid);
            
            if(noOfCows>=k)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }
        System.out.println(right);
    }

    public static void findMinimumDistanceBrute(int[] arr,int k)
    {
        int ans = -1;
        Arrays.sort(arr);
        int maxDistance = arr[arr.length-1] - arr[0];
        int i = 1;
        for(;i<=maxDistance;i++)
        {
            int noOfCows = findNoOfCows(arr, i);
            // System.out.println(i+" "+noOfCows);
            if(noOfCows==k)
            {
                ans = i;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{0,3,4,7,10,9};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        findMinimumDistanceBrute(arr,k);
    }
}
