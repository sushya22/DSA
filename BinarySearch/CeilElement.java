package BinarySearch;
import java.util.Scanner;

public class CeilElement {

    public static void fingCeilElement(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
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
        int[] arr = new int[]{1,2,3,4,5,7,8,9};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fingCeilElement(arr, n);
    }
}
