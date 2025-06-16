package BinarySearch;

import java.util.Scanner;

public class SqrtOfNumber {

    public static int findSqrt(int n)
    {
        int ans = -1;
        int left = 1;
        int right = n;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(mid * mid <= n)
            {
                ans = mid;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return right;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSqrt(n));   
    }
}
