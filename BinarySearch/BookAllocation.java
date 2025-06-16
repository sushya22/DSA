package BinarySearch;
import java.util.Scanner;
public class BookAllocation {

    public static int findStudents(int[] arr,int n)
    {
        int noStudents = 1;
        int pages = 0;
        for(int i=0;i<arr.length;i++)
        {
           if(pages+arr[i]<=n)
           {
             pages+=arr[i];
           }
           else
           {
            noStudents++;
            pages =arr[i];
           }
        }
        return noStudents;
    }

    public static void findMaximumPages(int[] arr,int studentNo)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
            sum+=arr[i];
        }

        for(int i=max;i<=sum;i++)
        {
            int noOfStudents = findStudents(arr,i);
            if(noOfStudents==studentNo)
            {
                System.out.println(i);
                break;
            }
            
        }
    }

    public static void findMaximumPagesOpt(int[] arr,int studentNo)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int left = max;
        int right = sum;
        int ans = 0;
        int mid = 0;
        while(left<=right)
        {
            mid = (left+right)/2;
            int noStudents = findStudents(arr, mid);
            if(noStudents<=studentNo)
            {
                right = mid - 1;
                ans = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{25, 46, 28, 49, 24};
        Scanner sc = new Scanner(System.in);
        int studentNo = sc.nextInt();
        findMaximumPagesOpt(arr,studentNo);
    }
}
