package BinarySearch;

import java.util.Scanner;

public class KthElementInSortedArray {

    public static void findKthElement(int[] arr1,int[] arr2,int n)
    {
        int[] result = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                result[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                result[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length)
        {
            result[k]=arr1[i];
            k++;
            i++; 
        }
        while(j<arr2.length)
        {
            result[k]=arr2[j];
            k++;
            j++;
        }

        System.out.println(result[n-1]);
    }

    public static void findKthElementBetter(int[] arr1,int[] arr2,int n)
    {
        
        int i = 0;
        int j = 0;
        int count = 0;
        int element = Integer.MIN_VALUE;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(count==n-1)
                {
                   element = arr1[i];
                   break;
                }
                count++;
                i++;
            }
            else
            {
                if(count==n-1)
                {
                   element = arr2[j];
                   break;
                }
                count++;
                j++;
            }
        }
        while(i<arr1.length && element == Integer.MIN_VALUE )
        {
            if(count==n-1)
            {
                   element = arr1[i];
                   break;
            }
            count++;
            i++; 
        }
        while(j<arr2.length  && element == Integer.MIN_VALUE )
        {
            if(count==n-1)
            {
                element = arr2[j];
                break;
            }
            count++;
            j++;
        }

        System.out.println(element);
    }

    public static int findKthElementOpt(int[] arr1,int[] arr2,int k)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1>n2) 
        {
            return findKthElementOpt(arr2, arr1, k);
        }
        int right = Math.min(n1,k);
        int left = Math.max(0,k-n2);
        while(left<=right)
        {
            int mid1 = (left+right)/2;
            int mid2 = k - mid1;
            int l1 = mid1>0?arr1[mid1-1]:Integer.MIN_VALUE;
            int l2 = mid2>0?arr2[mid2-1]:Integer.MIN_VALUE;
            int r1 = mid1<n1?arr1[mid1]:Integer.MAX_VALUE;
            int r2 = mid2<n2?arr2[mid2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1)
            {   
                return Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                right = mid1 - 1;
            }
            else
            {
                left = mid1 + 1;
            }

        }
        return -1;


    }
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{2,4,5,6};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(findKthElementOpt(arr1,arr2,k));

    }
}
