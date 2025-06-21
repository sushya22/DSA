package BinarySearch;

public class SearchSingleElement1 {

    public static int findSingleElement(int[] arr)
    {
        int n = arr.length;
        if(n==1)
        {
            return arr[0];
        }
        if(arr[0]!=arr[1])
        {
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2])
        {
            return arr[n-1];
        }
        int left = 1;
        int right = n - 2;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1])
            {
                System.out.println(arr[mid]);
                break;
            }
            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2!=0 && arr[mid]==arr[mid-1]))
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
        int[] arr = new int[]{1,1,3,3,5,5,6,7,7,8,8};
        findSingleElement(arr);
    }
}
