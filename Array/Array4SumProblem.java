package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Array4SumProblem {

    public static void printNumbersbrute(int[] arr, int n)
    {
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    for(int l=k+1;l<arr.length;l++)
                    {
                        if(arr[i]+arr[j]+arr[k]+arr[l]==n)
                        {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            Collections.sort(temp);
                            result.add(temp);
                        }
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

    public static void printNumbersBetter(int[] arr,int n)
    {
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        HashSet<Integer> tempHash = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {   
                tempHash.clear();
                for(int k=j+1;k<arr.length;k++)
                {
                    int target = n - (arr[i]+arr[j]+arr[k]);
                    if(tempHash.contains(target))
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(target);
                    }
                    tempHash.add(arr[k]);
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

    public static void printNumbersOpt(int[] arr,int n)
    {
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(j> i+1 && arr[j]==arr[j-1])
                {
                    continue;
                }

                int k = j+1;
                int l = arr.length-1;
                while(k<l)
                {    
                    int sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==n)
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        Collections.sort(temp);
                        result.add(temp);
                        k++;
                        while(k<l && arr[k]==arr[k-1])
                        {
                            k++;
                        }
                        l--;
                        while(k<l && arr[l]==arr[l+1])
                        {
                            l--;
                        }
                    }
                    else if(sum<n)
                    {
                        k++;
                    }
                    else if(sum>n)
                    {
                        l--;
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
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[]{4,3,3,4,4,2,1,2,1,1};
         printNumbersOpt(arr,n);
    }
}
