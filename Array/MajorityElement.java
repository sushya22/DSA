package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int findMajority(int[] arr)
    {
        int majority = arr[0];
        int n = arr.length;
        for(int i=0;i<arr.length;i++)
        {   
            int count = 0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                   count++;
                }
            }

            if(count>n/2)
            {
               majority = arr[i];
               break;
            }
        }
        return majority;
    }

    public static int hashSolution(int[] arr)
    {
        HashMap<Integer,Integer> m = new HashMap<>();
        int maxElement = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> i:m.entrySet())
        {
              if(i.getValue()>arr.length/2)
              {
                maxElement = i.getKey();
                break;
              }
        }

        return maxElement;
    }

    //Moore's algorithm
    public static int majorityOpt(int[] arr)
    {
        int majorityElement = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++)
        {   
            if(count==0)
            {
                majorityElement=arr[i];
            }
            if(arr[i]!=majorityElement)
            {
                count--;
            }
            if(arr[i]==majorityElement)
            {
                count++;
            }

        }
        return majorityElement;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,1,2};
        System.out.println(majorityOpt(arr));
    }
}
