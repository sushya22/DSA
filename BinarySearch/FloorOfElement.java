package BinarySearch;
import java.util.Scanner;
public class FloorOfElement {
    
    public static int findFloorElement(int[] arr,int n)
    {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;
        while(left<=right)
        {
              int mid = (left+right)/2;
              if(arr[mid]<=n)
              {
                ans = arr[mid];
                left = mid + 1;
              }
              else
              {
                right = mid - 1;
              }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5,7,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFloorElement(arr,n));

    }
}
