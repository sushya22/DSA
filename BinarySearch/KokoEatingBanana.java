package BinarySearch;
public class KokoEatingBanana {

    public static double timeTakenToEatAllBananas(int[] arr,int n)
    {
          double totalHour = 0;
          for(int i=0;i<arr.length;i++)
          {
            totalHour += Math.ceil((double)arr[i]/(double)n);  
          }
          return totalHour;
    }

    public static void findMinimumBananas(int[] arr, int h)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }
        for(int j=1;j<=max;j++)
        {
            double timetaken = timeTakenToEatAllBananas(arr,j);
            
            if(timetaken<=h)
            {
                System.out.println(j);
                break;
            }
        }
    }

    public static void findMinimumBananasOptimal(int[] arr,int h)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }
        int left = 1;
        int right = max;
        int ans = max;
        while(left<=right)
        {
            int mid = (left+right)/2;
            double totalHours = timeTakenToEatAllBananas(arr,mid);
            if(totalHours<=h)
            {
                ans = mid;
                right = mid - 1;
            }
            else
            {
                left = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        {
            int[] arr = new int[]{7, 15, 6, 3};
            int h = 5;
            findMinimumBananasOptimal(arr,h);
        }
    }
}
