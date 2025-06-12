package Array;

import java.util.HashMap;
import java.util.Map;

public class RepeatingAndMissingNumber {

    public static void printRepeatingNMissingNo(int[] arr)
    {
        int missing = -1;
        int repeating = -1;
        int count = 0;
        for(int i=1;i<=arr.length;i++)
        {   
            count = 0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    count += 1;
                } 
            }

            if(count==0)
            {
                missing = i;
            }
            if(count==2)
            {
                repeating = i;
            }
            if(missing!=-1 && repeating!=-1)
            {
                break;
            }
        }
        System.out.println("Missing: "+missing);
        System.out.println("Repeating: "+repeating);
    }

    public static void printMissingNRepeatingBetter(int[] arr)
    {
        int missing = -1;
        int repeating = -1;
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i], 0)+1);
        }
        for(int j=1;j<=arr.length;j++)
        {  
            if(m.containsKey(j) && m.get(j)==2)
            {
                repeating = j;
            }
            if(!m.containsKey(j))
            {
                missing = j;
            }
            if(missing!=-1 && repeating!=-1)
            {
                break;
            }
            
        }
        System.out.println("Missing: "+missing);
        System.out.println("Repeating: "+repeating);   
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,3,5};
        printMissingNRepeatingBetter(arr);
    }
} 
