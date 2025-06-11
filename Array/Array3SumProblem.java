package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array3SumProblem {

    public static void printTripletHashing(int[] arr)
    {
        HashSet<Integer> s = new HashSet<>();
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++)
        {   
            s.clear();
            for(int j=i+1;j<arr.length;j++)
            {
                int target = - (arr[i]+arr[j]);
                if(s.contains(target))
                {
                   ArrayList<Integer> temp = new ArrayList<Integer>();
                   temp.add(arr[i]);
                   temp.add(arr[j]);
                   temp.add(target);
                   Collections.sort(temp);
                   result.add(temp);
                   
                }
                s.add(arr[j]);
            }
        }
        
        for(ArrayList<Integer> element:result)
        {
            for(int i:element)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void printTriplet(int[] arr)
    {
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add(arr[i]);
                        t.add(arr[j]);
                        t.add(arr[k]);
                        // System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        Collections.sort(t);
                        result.add(t);
                    }
                }
            }
        }

        for(ArrayList<Integer> element:result)
        {
            for(int item:element)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    public static void printTripletOpt(int[] arr)
    {
        Arrays.sort(arr);
        int j = 0;
        int k = 0;
        Set<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            j = i+1;
            k = arr.length - 1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]<0)
                {
                    j++;
                }

                else if(arr[i]+arr[j]+arr[k]>0)
                {
                    k--;
                }
                else
                {
                    ArrayList<Integer> temp =  new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    Collections.sort(temp);
                    result.add(temp);
                    j++;
                    while(j<k && arr[j]==arr[j-1])
                    {
                        j++;
                    }

                    k--;
                    while(j<k && arr[k]==arr[k+1])
                    {
                        k--;
                    }
                }
            }
        }

        for(ArrayList<Integer> element:result)
        {
            for(int i:element)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        printTripletOpt(arr);
    }
}
