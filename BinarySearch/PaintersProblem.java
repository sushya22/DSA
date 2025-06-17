package BinarySearch;
import java.util.Scanner;
public class PaintersProblem {
    
    public static int findPainters(int[] arr,int time)
    {
        int noPainters = 1;
        int timeTaken = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(timeTaken+arr[i]<=time)
            {
                timeTaken+=arr[i];
            }
            else
            {
                noPainters++;
                timeTaken = arr[i];
            }
        }
        return noPainters;
    }
    public static void FindMinimumTime(int[] arr,int k)
    {
        int minTime = Integer.MIN_VALUE;
        int maxTime = 0;
        for(int i=0;i<arr.length;i++)
        {
            minTime = Math.max(minTime,arr[i]);
            maxTime +=arr[i];
        }

        for(int i=minTime;i<=maxTime;i++)
        {
            int noOfPainters = findPainters(arr,i);
            if(noOfPainters==k)
            {
                System.out.println(i);
                break;
            }
        }
    }

    public static void findMinimumTime(int[] arr,int n)
    {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i=0;i<arr.length;i++)
        {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        int left = start;
        int right = end;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int noPainters = findPainters(arr, mid);
            if(noPainters<=n)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
    public static void main(String[] args)
    {
        int[] arr=new int[]{10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        FindMinimumTime(arr,n);
    }
}
