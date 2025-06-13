package BinarySearch;
import java.util.Scanner;

public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] arr,int left,int right,int n)
    {
        if(left<=right)
        {
           int mid = (left+right)/2;
           if(arr[mid]==n)
           {
            return mid;
           }

           else if(arr[mid]<n)
           {
            return binarySearchRecursive(arr,mid+1,right,n);
           }

           else
           {
            return binarySearchRecursive(arr,left,mid - 1,n);
           }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binarySearchRecursive(arr,0,arr.length-1,n));
    }
}
