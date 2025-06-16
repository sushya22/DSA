package BinarySearch;
//observation.
//[1,1,2,2,3,4,4,5,5] first half of single element; elements occur at even and odd index. after single element they occur at add and even index.

public class SearchSingleElement {

    public static int findSingleElement(int[] arr)
    {
        if(arr.length==1)
        {
            return arr[0];
        }

        if(arr[0]!=arr[1])
        {
            return arr[0];
        }

        if(arr[arr.length-1]!=arr[arr.length-2])
        {
            System.out.println("567890");
            return arr[arr.length-1];
            
        }

        int left = 1;
        int right = arr.length - 2;
        while(left<=right)
        {
             int mid = (left+right)/2;
             if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
             {
                return arr[mid];
             }
              
             if((mid%2==1 && arr[mid-1]==arr[mid]) || (mid%2==0 && arr[mid+1]==arr[mid]))
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
        int[] arr = new int[]{1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(findSingleElement(arr));
    }   
}
