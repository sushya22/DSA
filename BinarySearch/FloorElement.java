package BinarySearch;
import java.util.Scanner;
public class FloorElement {

    public static void findFloorElement(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]<=n)
            {
                ans = mid;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }

        System.out.println(arr[ans]);
    }
    public static void main(String[] args)
    {
        int[] arr =  new int[]{1,2,4,5,6,7,9};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findFloorElement(arr,n);
    }
}
