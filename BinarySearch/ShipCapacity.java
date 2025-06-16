package BinarySearch;
import java.util.Scanner;
public class ShipCapacity {

    public static int findDeliveryDays(int[] arr,int n)
    {
        int count = 0;
        int weight = 0;
        for(int i=0;i<arr.length;i++)
        {   
            weight+=arr[i];

            if(weight==n)
            {
               count+=1;
               weight = 0;
            }
            else if(weight>n)
            {
              weight = arr[i];
              count+=1;
            }
        }
        if(weight!=0)
        {
            count+=1;
        }
        
        return count;
    }

    public static void findMinimumCapacity(int[] arr,int d)
    {
        //ship capacity has to be atleast the maximum weight of container to carry that in one day. so our search space will start from max weight to sum of all weights(basically incase if we want to deliver containers in one day).
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
            sum+=arr[i];
        }

        int startCapacity = max;
        int maxCapacity = sum;

        for(int i=startCapacity;i<=maxCapacity;i++)
        {
            int noOdDaysForDelivery = findDeliveryDays(arr,i);
            if(noOdDaysForDelivery==d)
            {
                System.out.println(i);
                break;
            }
        }


    }

    public static void findMinimumCapacityOptimal(int[] arr,int n)
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
        while(left<=right)
        {
            int mid = (left+right)/2;
            int noDays = findDeliveryDays(arr,mid);
            if(noDays==n)
            {
                System.out.println(mid);
                break;
            }
            else if(noDays<n)
            {
                right = mid -1;

            }
            else
            {
                left = mid + 1;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,4,5,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        findMinimumCapacityOptimal(arr,d);
    }
}
 