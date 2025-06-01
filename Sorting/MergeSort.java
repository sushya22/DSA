package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void sort(int[] arr,int left,int mid,int right){
        ArrayList<Integer> larray = new ArrayList<>();
        ArrayList<Integer> rarray = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=left;i<=mid;i++)
        {
            larray.add(arr[i]);
        }
        for(int i=mid+1;i<=right;i++)
        {
            rarray.add(arr[i]);
        }
        int j = left;
        int k = mid+1;
        while(j<=mid && k<=right)
        {
            if(arr[j]<=arr[k])
            {
               result.add(arr[j]);
               j++;
            }
            else{
               result.add(arr[k]);
               k++;
            }
        }

        while(j<=mid){
            result.add(arr[j]);
            j++;
        }

        while(k<=right)
        {
            result.add(arr[k]);
            k++;
        }

        for(int i=0;i<result.size();i++){
            arr[left+i] = result.get(i);
        }

    }
    public static void divide(int[] arr,int left,int right){
        if(left<right)
        {
            int mid = (left+right)/2;
            divide(arr,left,mid);
            divide(arr,mid+1,right);
            sort(arr,left,mid,right);

        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        divide(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    
}
