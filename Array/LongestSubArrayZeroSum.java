package Array;

import java.util.HashMap;

public class LongestSubArrayZeroSum {

    public static void longestSubarrayLength(int[] arr)
    {
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        int maxi = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            if(sum==0)
            {
                maxi = i+1;
            }
            else
            {
                if(result.get(sum)==null)
                {
                    result.put(sum,i);
                }
                else
                {
                    maxi = Math.max(maxi,i-result.get(sum));
                }
            }

        }
        System.out.println(maxi);
    }
    public static void main(String[] args)
    {
         int[] arr = new int[]{9, -3, 3, -1, 6, -5};
         longestSubarrayLength(arr);
    }
}
