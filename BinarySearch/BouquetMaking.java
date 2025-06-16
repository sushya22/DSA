package BinarySearch;
import java.util.Scanner;
public class BouquetMaking {

    public static int getBouquetCount(int[] arr,int day,int adjuscent)
    {
        int count = 0;
        int noOfBouquets = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                noOfBouquets+=count/adjuscent;
                count = 0;
            }
        }
        noOfBouquets+=count/adjuscent;
        return noOfBouquets;

    }

    public static void findMinimumdays(int[] arr,int noBouquet,int adjuscent)
    {
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minDay = Math.min(arr[i],minDay);
            maxDay = Math.max(arr[i],maxDay);
        }

        for(int i = minDay;i<=maxDay;i++)
        {
            int bouquetOnday = getBouquetCount(arr,i,adjuscent);
            
            if(bouquetOnday>=noBouquet)
            {
                System.out.println(i);
                break;
            }
        }
        
    }

    public static void findMinimumdaysOptimal(int[] arr,int noBouquet, int adjuscent)
    {
         int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minDay = Math.min(arr[i],minDay);
            maxDay = Math.max(arr[i],maxDay);
        }
        int left = minDay;
        int right = maxDay;
        int ans = maxDay;
        while(left<=right)
        {
            int mid = (left+right)/2;
            
            int noOfBouquetsOnDay = getBouquetCount(arr,mid,adjuscent);
            if(noOfBouquetsOnDay>=noBouquet)
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
        int[] arr = new int[]{7, 7, 7, 7, 13, 11, 12, 7};
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        findMinimumdaysOptimal(arr,m,k);
    }
}
