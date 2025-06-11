package Array;

import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveDuplicates {

    public static void removeDuplicates(int[] arr)
    {
        Set<Integer> s= new HashSet<>();
        for(int i:arr)
        {
            s.add(i);
        }
        for(int i:s)
        {
            System.out.println(i);
        }
    }

    public static void removeDups(int[] arr)
    {
        int i = 0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]!=arr[j] && arr[i]<arr[j])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(int j:arr)
        {
            System.out.println(j);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,1,2,3,4,5,6,7};
        removeDups(arr);
    }
    
}
