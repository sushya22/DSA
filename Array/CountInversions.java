package Array;

import java.util.ArrayList;

public class CountInversions {

    public static void printInversionCount(int[] arr)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int merge(int[] arr,int left,int mid,int right)
    {   
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        int i = left;
        int j = mid+1;
        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                count+=mid-i+1;
                j++;
            }
        }

        while(i<=mid)
        {
            temp.add(arr[i]);
            i++;
        }

        while(j<=right)
        {
            temp.add(arr[j]);
            j++;
        }

        for(int k=0;k<temp.size();k++)
        {
            arr[left+k] = temp.get(k);
        }
        return count;
    }

    public static int divide(int[] arr,int left,int right)
    {   int count = 0;
        if(left<right)
        {
            int mid = (left+right)/2;
            count+=divide(arr,left,mid);
            count+=divide(arr,mid+1,right);
            count+= merge(arr,left,mid,right);
            return count;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,4,3,2,1};
        System.out.println(divide(arr,0,arr.length-1));
    }
}