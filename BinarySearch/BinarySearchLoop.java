package BinarySearch;
import java.util.Scanner;
public class BinarySearchLoop {

    public static int binarySearch(int[] arr, int n)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==n)
            {
                return mid;
            }
            else if(arr[mid]<n)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binarySearch(arr,n));
    }
}
