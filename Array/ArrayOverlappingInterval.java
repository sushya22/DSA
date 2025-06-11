package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOverlappingInterval {
    
    
    public static void findOverlapingInterval(int[][] arr)
    {
        // Arrays.sort(arr);
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++)
        {
            int start = arr[i][0];
            int end = arr[i][1];
            if(result.size()!=0 && result.get(result.size()-1).get(1)>=start)
            {
                continue;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j][0]<end)
                {
                    end = Math.max(end,arr[j][1]);
                }
                else
                {
                    break;
                }
            }

            List<Integer> l = Arrays.asList(start,end);
            ArrayList<Integer> temp = new ArrayList<Integer>(l);
            result.add(temp);
        }

        for(ArrayList<Integer> i:result)
        {
            for(int j:i)
            {
                System.out.println(j);
            }
        }
    }

    public static void findOverlapingIntervalOpt(int[][] arr)
    {
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(result.size()==0 || result.getLast().get(1)<arr[i][0])
            {   
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i][0]);
                temp.add(arr[i][1]);
                result.add(temp);
            }
            else
            {
                result.getLast().set(1,Math.max(result.getLast().get(1),arr[i][1]));
            }
        }

        for(ArrayList<Integer> i:result)
        {
            for(int j:i)
            {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] arr = new int[][]{{1,3},{2,6},{8,10},{15,18},{16,17}};
        findOverlapingIntervalOpt(arr);

    }
}
