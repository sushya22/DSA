package DSAJAVA;
import java.util.HashMap;
import java.util.Map;

public class HashFrequency {
    public static void countFrequency(int[] arr)
    {
        int[] visited = new int[arr.length];
        visited[0] = 0;
        for(int i=0;i<arr.length;i++)
        {   
            int count = 0;
            if(visited[i]==1)
            {
                continue;
            }
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j] = 1;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }

    public static void countFrequencyMap(int[] arr)
    {
        Map<Integer,Integer> m = new HashMap<>();
        
        for (int i : arr) {
            m.put(i,m.getOrDefault(i,0 )+1);
        }
        
        for(Map.Entry<Integer,Integer> i : m.entrySet()) {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
    public static void main(String args[])
    {
        // countFrequency(new int[] {1,2,3,4,2,3,6,3,3,2,1});
        countFrequencyMap(new int[] {1,2,3,4,2,3,6,3,3,2,1});
    }
}
