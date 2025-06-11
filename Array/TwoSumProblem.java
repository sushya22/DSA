package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

    public static void findPairs(int[] arr,int k)
    {   
        boolean pairFound = false;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {   
                    pairFound = true;
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }

            if(pairFound)
            {
                break;
            }
        }
    }

    public static void hashPair(int[] arr,int k)
    {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int rem = k - arr[i];
            if(m.containsKey(rem))
            {
                System.out.println(rem+" "+arr[i]);
                break;
            }

            m.put(arr[i],i);
        }

        
    }

    public static void sumOpt(int[] arr,int k)
    {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==k)
            {
                System.out.println(arr[i]+" "+arr[j]);
                break;
            }

            if(arr[i]+arr[j]<k)
            {
                i++;
            }

            else
            {
                j--;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,6,0,7};
        int k = 6;
        hashPair(arr,k);
    }
}
