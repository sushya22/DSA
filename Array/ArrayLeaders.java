package Array;

import java.util.ArrayList;

public class ArrayLeaders {
    public static ArrayList<Integer> findLeadersOptimal(int[] arr)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>(); 
        int leader = arr[arr.length-1];
        temp.add(leader);
        for(int i = arr.length-1;i>=0;i--)
        {
            if(arr[i]>leader)
            {
                
                leader = arr[i];
                temp.add(leader);
            }
        }

        return temp;
    }

    public static ArrayList<Integer> findLeadersBruteForce(int[] arr)
    {
         ArrayList<Integer> temp = new ArrayList<>(arr.length);
         int lastElement = 0;
         boolean leader = true;
         for(int i=0;i<arr.length-1;i++)
         {  lastElement = arr[i];
            leader = true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>lastElement)
                {   
                    leader = false;
                    break;
                }
            }

            if(leader)
            {
               temp.add(arr[i]);     
            }
         }
         temp.add(arr[arr.length-1]);
         return temp;
    }
    public static void main(String[] args)
    {
            int[] arr = new int[]{10, 22, 12, 3, 0, 6};
            ArrayList<Integer> result;
            result = findLeadersOptimal(arr);
            for(int i:result)
            {
                System.out.println(i);
            }
    }   
}
