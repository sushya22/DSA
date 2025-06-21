package BinarySearch;
import java.util.Scanner;

public class ArrayRotationBS {

    public static void findFirstOccurence(int[] arr, int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        int minimum = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[left]<=arr[right])
            {
                if(arr[left]<minimum)
                {
                    minIndex = arr[left];
                    minIndex = left;
                }
                break;
            }

            if(arr[mid]<=arr[right])
            {
                if(arr[mid]<minimum)
                {
                    minimum = arr[mid];
                    minIndex = mid;
                }
                right = mid - 1;
            }
            else
            {
                if(arr[left]<=arr[mid])
                {
                    if(arr[left]<minimum);
                    {
                        minimum = arr[left];
                        minIndex = left;
                    }
                    left = mid + 1;
                }
            }

        }
       System.out.println( (arr.length - minIndex) % arr.length) ;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,4,5,6,7,1,2};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findFirstOccurence(arr,n);
    }
}
