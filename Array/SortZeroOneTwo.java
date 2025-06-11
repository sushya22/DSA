package Array;

public class SortZeroOneTwo {
    public static void sortArray(int[] arr)
    {
        int count_0 =0, count_1 = 0, count_2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count_0++;
            }

            if(arr[i]==1)
            {
                count_1++;
            }

            if(arr[i]==2)
            {
                count_2++;
            }
        }

        for(int i=0;i<count_0;i++)
        {
            arr[i] = 0;
        }

        for(int j=0;j<count_1;j++)
        {
            arr[j+count_0] = 1;
        }

        for(int j=0;j<count_2;j++)
        {
            arr[j+count_0+count_1] = 2;
        }

    }

    public static void sortArrayOpt(int[] arr)
    {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }

            else if(arr[mid]==1)
            {
                mid++;
            }

            else
            {
               int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--; 
            }
        }
    }
    public static void main(String[] args)
    {
         int[] arr = new int[]{0,1,2,1,1,2,0,0,0,0};
         sortArrayOpt(arr);
         for(int i:arr)
         {
            System.out.println(i);
         }
    }
}
