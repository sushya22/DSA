package BinarySearch;
import java.util.Scanner;
public class PeakElement1 {

    public static void findPeak(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        if(arr.length == 1)
        {
            System.out.println(arr[0]);
            System.exit(0);
        }
        if(arr[0]>arr[1])
        {
            System.out.println(arr[0]);
            System.exit(0);
        }
        if(arr[arr.length - 1]>arr[arr.length - 2])
        {
            System.out.println(arr[arr.length - 1]);
            System.exit(0);
        }

        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid-1]< arr[mid] && arr[mid] > arr[mid+1])
            {
                ans = arr[mid];
                
                break;
            }
            else if(arr[mid-1]<arr[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findPeak(arr,n);
    }
}
