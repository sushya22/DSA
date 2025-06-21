package BinarySearch;

import java.util.Scanner;

public class FirstOccurence1 {

    public static void findFirstOccurence(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
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

        System.out.println(ans+" "+arr[ans]);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,1,1,1,1,1,1,1,3,5,7,9,10,12,12,21,43};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findFirstOccurence(arr,n);
    }
}
