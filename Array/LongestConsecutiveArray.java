package Array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveArray {

    public static boolean findElement(int[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                return true;
            }
        }

        return false;
    }

    public static int longestConsecutiveSubArrayBruteForce(int[] arr)
    {
        int maxLen = 1;
        int lastElement = arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            lastElement = arr[i];
            count=1;
            while(findElement(arr, lastElement+1))
            {
                count+=1;
                lastElement=lastElement+1;
            }
            maxLen = Math.max(maxLen,count);
        }

        return maxLen;
    }

    public static int longestConsecutiveSubArrayBetterSolution(int[] arr)
    {
        int maxLength = 1;
        int lastElement = arr[0];
        int count = 1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==lastElement+1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            lastElement = arr[i];
            maxLength = Math.max(maxLength,count);
        }
        return maxLength;
    }

    public static int longestConsecutiveSubArrayOpt(int[] arr)
    {
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            s.add(arr[i]);
        }

        int maxLen = 0;
        int count = 0;
        int element = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(!s.contains(arr[i]-1))
            {
                count = 1;
                element = arr[i];
                while(s.contains(element+1))
                {
                    count++;
                    element = element+1;
                }
                maxLen = Math.max(maxLen,count);
            }
        }

        return maxLen;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {3, 8, 5, 7, 6};
        System.out.println(longestConsecutiveSubArrayOpt(arr));
    }
}
