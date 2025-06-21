package BinarySearch;

import java.util.Scanner;

public class LowerBound1 {

    public static void findLowerBound(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        int mid = 0;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(arr[mid]>=n)
            {
               ans = mid;
               right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        System.out.println(arr[right+1]+"  ---  "+right);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5,5,7,9};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findLowerBound(arr,n);
    }
}
