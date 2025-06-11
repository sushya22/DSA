package Array;
import java.util.HashMap;
import java.util.Scanner;
public class SubArraysKsum {
    public static void countSubArrays(int[] arr,int n)
    {  
       
       int count = 0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i;j<arr.length;j++)
        {   
            int sum = 0;
            for(int k=i;k<=j;k++)
            {
               sum+=arr[k];
            }
            if(sum==n)
            {
               count++;
            }
        }
       }

       System.out.println(count);
    }

    public static void countSubArraysBetter(int[] arr,int n)
    {  
       
       int count = 0;
       for(int i=0;i<arr.length;i++)
       { 
        int sum = 0;
        for(int j=i;j<arr.length;j++)
        {   
            sum+=arr[j];    
            if(sum==n)
            {
               count++;
            }
        }
       }

       System.out.println(count);
    }

    public static void countSubarraysOpt(int[] arr,int n)
    {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       int count = 0;
       int sum =0;
       map.put(0,1);
       for(int i=0;i<arr.length;i++)
       {
         sum = sum + arr[i];
         int remaining = sum - n;
         count+=map.getOrDefault(remaining,0);
         map.put(sum,map.getOrDefault(sum, 0)+1);
       }
       System.out.println(count);
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[]{3, 1, 2, 4};
       countSubarraysOpt(arr,n);
    }
}
