package BinarySearch;

public class PeakElement {

    public static int findPeak(int[] arr)
    {
        int n = arr.length;
        if(n==1)
        {
            return 0;
        }
        if(arr[0]>arr[1])
        {
            return 0;
        }
        if(arr[n-1]>arr[n-2])
        {
            return n-1;
        }
        int left = 1;
        int right = n-2;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }

            if(arr[mid-1]<arr[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(findPeak(arr));
    }
}
