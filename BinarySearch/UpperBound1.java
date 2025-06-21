package BinarySearch;
import java.util.Scanner;
public class UpperBound1 {

    public static void findUpperBound(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]>n)
            {
                ans = mid;
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        System.out.println(arr[ans]);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5,7,7,9};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findUpperBound(arr,n);
    }
}
