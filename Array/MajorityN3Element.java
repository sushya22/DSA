package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityN3Element {

    public static void printMajorityBrute(int[] arr)
    {   
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
        {   
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>arr.length/3 && result.size()==0)
            { 
              result.add(arr[i]);   
            }
            if(count>arr.length/3 && result.size()!=0 && result.get(0)!=arr[i])
            {
                result.add(arr[i]);
                break;
            }
        }

        for(int i:result)
        {
          System.out.println(i);
        }
    }

    public static void majorityElementBetter(int[] arr)
    {
        HashMap<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i], 0)+1);
            if(m.get(arr[i])>arr.length/3)
            {
               a.add(arr[i]);
            }

            if(a.size()==2)
            {
                break;
            }
        }

        for(int i:a)
        {
            System.out.println(i);
        }
    }

    public static void majorityElementOpt(int[] arr)
    {
        int count1 = 0;
        int count2 = 0;
        int el1 = 0;
        int el2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(count1==0 && arr[i]!=el2)
            {
                el1 = arr[i];
                count1 = 1;
            }

            else if(count2==0 && arr[i]!=el1)
            {
                el2 = arr[i];
                count2 = 1;
            }

            else if(el1==arr[i])
            {
                count1++;
            }

            else if(el2==arr[i])
            {
                count2++;
            }

            else
            {
                count1--;
                count2--;
            }
        }

        if(count1>arr.length/3)
        {
            System.out.println(el1);
        }

        if(count2>arr.length/3)
        {
            System.out.println(el2);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,1,2,3,4,2,2};
        printMajorityBrute(arr);
    }
}
