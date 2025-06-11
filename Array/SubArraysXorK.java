package Array;

import java.util.HashMap;

public class SubArraysXorK {
    public static void countSubarray(int[] arr,int n)
    {
        int xor = 0;
        int count = 0;
        HashMap<Integer,Integer> tempHash = new HashMap<>();
        tempHash.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            xor ^=arr[i];
            int preXor = xor ^ n;
            count+=tempHash.getOrDefault(preXor,0);
            tempHash.put(xor,tempHash.getOrDefault(xor, 0)+1);
        }
        System.out.println(count);   
    }
    public static void main(String[] args)
    {
         int[] arr = new int[]{5, 6, 7, 8, 9};
         int n = 5;
         countSubarray(arr,n);
    }
}
