package BinarySearch;
import java.util.Scanner;
public class FindArrayRotation {

    public static int findRotation(int[] arr)
    {
        int minIndex = Integer.MAX_VALUE;
        int minElement = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[left]<=arr[right])
            {   
                if(arr[left]<minElement)
                {
                   minElement = Math.min(minElement,arr[left]);
                   minIndex = left;
                }
                
                break;
            }
            if(arr[left]<=arr[mid])
            {   
                if(arr[left]<minElement)
                {
                   minElement = Math.min(minElement,arr[left]);
                   minIndex = left;
                }
                left = mid + 1;
            }
            else
            {   
                if(arr[left]<minElement)
                {
                   minElement = Math.min(minElement,arr[mid]);
                   minIndex = mid;
                }
                
                right = mid - 1;
            }
        }
        return (arr.length - minIndex) % arr.length;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{0,1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println(findRotation(arr));
    }
}
