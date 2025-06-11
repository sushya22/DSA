package Array;

import java.util.HashMap;

public class LongestSubArraySum {

    public static int calcSubArrayBetter(int[] arr,int arraySum)
    {
        int maxLen = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {   
            sum = 0;
            for(int j=i;j<arr.length;j++)
            {
               sum+=arr[j];
               if(sum==arraySum)
               {
                maxLen = Math.max(maxLen,j-i+1);
               }
            }
        }

        return maxLen;
    }
  
    public static int calcSubArray(int[] arr,int arraySum)
    {
        int maxLen = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }

                if(sum==arraySum)
                {
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }

        return maxLen;
    }

    public static int maxSubArray(int[] arr,int k)
    {
        int maxLen = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            if(sum==k)
            {
                maxLen = Math.max(maxLen,i+1);
            }

            int rem = sum-k;
            if(m.containsKey(rem))
            {
                maxLen = Math.max(maxLen,i-m.get(rem));
            }

            if(!m.containsKey(sum))
            {
               m.put(sum,i);
            }
        }
        return maxLen;
    }

    public static int subArrayOpt(int[] arr,int k)
    {
        int maxLen = 0;
        int i = 0;
        int j = 0;
        int sum = arr[0];
        while(j<arr.length)
        {
            while(sum>k && i<=j)
            {
                sum-=arr[i];
                i++;
            }

            if (sum==k)
            {
                maxLen = Math.max(maxLen,j-i+1);
            }

            j++;

            if(j<arr.length)
            {
                sum+=arr[j];
            }
        }

        return maxLen;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,3,5,7,9,2,4,6,8,0,0,-1,1};
        System.out.println(subArrayOpt(arr,8));
    }
}
