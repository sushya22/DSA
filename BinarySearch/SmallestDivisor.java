package BinarySearch;
import java.util.Scanner;
public class SmallestDivisor {

    public static int findSumDivisons(int[] arr,int n)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+= Math.ceil((double)arr[i]/(double)(n));
        }
        return sum;
    }

    public static void findMinimumDivisor(int[] arr,int threshould)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }

        for(int i=1;i<=max;i++)
        {
            int sumOfDivisons = findSumDivisons(arr,i);
            if(sumOfDivisons<=threshould)
            {
                System.out.println(i);
                break;
            }
        }
    }

    public static void findMinimumDivisorOpt(int[] arr,int threshould)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }
        int ans = -1;
        int left = 1;
        int right = max;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int sumOfDivisons = findSumDivisons(arr, mid);
            if(sumOfDivisons<=threshould)
            {
                 ans = mid;
                 right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int threshould = sc.nextInt();
        findMinimumDivisorOpt(arr,threshould);
    }
}
