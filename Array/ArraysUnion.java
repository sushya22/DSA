package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArraysUnion {
    public static Set arrayunion(int[] arr1,int[] arr2)
    {
        int i = 0;
        int j = 0;
        Set<Integer> s = new TreeSet<>();
        while(i<arr1.length && j<arr2.length)
        {
              if(arr1[i]<=arr2[j])
              {
                s.add(arr1[i]);
                i++;
              }

              else
              {
                s.add(arr2[j]);
                j++;
              }
        }

        while(i<arr1.length)
        {
            s.add(arr1[i]);
                i++;
        }

        while(j<arr2.length)
        {
            s.add(arr1[j]);
                j++;
        }

        return s;
    }

    public static ArrayList<Integer> unionmap(int[] arr1,int[] arr2)
    {
        Map<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            m.put(arr1[i],m.getOrDefault(arr1[i], 0));
        }

        for(int i=0;i<arr2.length;i++)
        {
            m.put(arr2[i],m.getOrDefault(arr2[i], 0));
        }

        for(int i:m.keySet())
        {
            a.add(i);
        }
        return a;

    }

    public static ArrayList<Integer> unionopt(int[] arr1,int[] arr2)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(result.size()==0 || result.getLast()!=arr1[i])
                {
                    result.add(arr1[i]);
                }
                i++;
            }

            else
            {
                if(result.size()==0 || result.getLast()!=arr2[j])
                {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<arr1.length)
        {
            if(result.size()==0 || result.getLast()!=arr1[i])
                {
                    result.add(arr1[i]);
                }
                i++;
        }

        while(j<arr2.length)
        {
            if(result.size()==0 || result.getLast()!=arr2[j])
                {
                    result.add(arr2[j]);
                }
                j++;
        }

        return result;
    }
    public static void main(String[] args)
    {   
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[]  {2,3,4,4,5};
        ArrayList<Integer> a = unionopt(arr1,arr2);
        for(int i:a)
        {
            System.out.println(i);
        }

    }
}
