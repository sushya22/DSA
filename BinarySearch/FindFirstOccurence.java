package BinarySearch;
import java.util.Scanner;
public class FindFirstOccurence {

    public static int findFirstOccurence(int[] arr,int n)
    {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==n)
            {
                ans =  mid;
                right = mid - 1;
            }
            else if(arr[mid]>n)
            {
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
      int[] arr = new int[]{3,4,13,13,13,20,40};
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(findFirstOccurence(arr,n));
    }
}
