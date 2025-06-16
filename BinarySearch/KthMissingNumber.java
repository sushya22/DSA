package BinarySearch;
import java.util.Scanner;
public class KthMissingNumber {

    public static void findKthElement(int[] arr,int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                k++;
            }
        }

        System.out.println(k);
    }

    

    public static void findMissingBS(int[] arr,int k)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int missingNo = arr[mid]-(mid+1);
            if(missingNo<k)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        System.out.println(left+k);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{4,5,8,10};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        findMissingBS(arr, k);

    }
}
