package BinarySearch;
import java.util.Scanner;
public class FindLastOccurence1 {

    public static void findLastOccurence(int[] arr,int n)
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

        System.out.println(ans+" "+arr[ans]);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,1,2,4,5,5,6,7};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        findLastOccurence(arr,n);
    }
}
