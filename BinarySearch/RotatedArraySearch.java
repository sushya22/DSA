package BinarySearch;
import java.util.Scanner;
public class RotatedArraySearch {

    public static void findNumberRotate(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==n)
            {
                System.out.println(mid+" "+arr[mid]);
                break;
            }
            else if(arr[left]<=arr[mid])
            {
                if(arr[left]<= n && n<=arr[mid])
                {
                   right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            else
            {
                if(arr[mid]<=n && n<=arr[right])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,5,7,9,10};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findNumberRotate(arr,n);
    } 
}
