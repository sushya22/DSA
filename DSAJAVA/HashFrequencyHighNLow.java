package DSAJAVA;
import java.util.HashMap;
import java.util.Map;

public class HashFrequencyHighNLow {

    public static void findHighNLow(int[] arr)
    {
        int visited[] = new int[arr.length];
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
        int maxElement = 0;
        int minElement = 0;
        for(int i=0;i<arr.length;i++)
        {   
            int count = 0;
            if(visited[i]==1)
            {
                continue;
            }
            count++;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=1;
                }
            }
            
            if(count>maxFrequency)
            {
              maxFrequency = count;
              maxElement = arr[i];
            }
             
            if(count<minFrequency)
            {
            minFrequency = Math.min(minFrequency,count);
            minElement = arr[i];
            }
        }
        System.out.println(minElement+" "+minFrequency);
        System.out.println(maxElement+" "+maxFrequency);

    }

    public static void findHighNLowMap(int[] arr)
    {
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i:arr)
        {
            m.put(i,m.getOrDefault(i, 0)+1);
        }
        int highf = Integer.MIN_VALUE;
        int lowf = Integer.MAX_VALUE;
        int highelement = 0;
        int lowelement = 0;
        for(Map.Entry<Integer,Integer> i:m.entrySet())
        {    
            int frequency = i.getValue();
            int key = i.getKey();
            if(frequency>highf)
            {
                highf = frequency;
                highelement = key;
            }

            if(frequency<lowf)
            {
                lowf = frequency;
                lowelement = key;
            }
        }
        System.out.println(lowelement+" "+lowf);
        System.out.println(highelement+" "+highf);
    }
    public static void main(String[] args)
    {
        // findHighNLow(new int[] {1,2,3,4,5,4,4,1,2,5,9,3});
        findHighNLowMap(new int[] {1,2,3,4,5,4,4,1,2,5,9,3});
    }
}
