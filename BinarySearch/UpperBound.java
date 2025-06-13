package BinarySearch;
//Upper bound of element x is smallest index such that : arr[index]>x
import java.util.Scanner;

public class UpperBound {

    public static int upperBound(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]> n)
            {
                ans = arr[mid];
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
        int[] arr = new int[]{1,3,5,7,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(upperBound(arr,n));
    }
}
