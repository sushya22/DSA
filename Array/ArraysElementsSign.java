package Array;

import java.util.ArrayList;

public class ArraysElementsSign {

    public static void rearrangeElements(int[] arr)
    {
        int[] temp = new int[arr.length];
        int i_pos = 0;
        int i_neg = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                temp[i_pos] = arr[i];
                i_pos+=2;
            }
            else
            {
                temp[i_neg] = arr[i];
                i_neg+=2;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = temp[i];
        }

    }

    public static void rearraneElementsUnEven(int[] arr)
    {
        ArrayList<Integer> arrpos = new ArrayList<Integer>();
        ArrayList<Integer> arrneg = new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                arrpos.add(arr[i]);
            }
            else
            {
                arrneg.add(arr[i]);
            }
        }

        if(arrpos.size()<arrneg.size())
        {
            for(int i=0;i<arrpos.size();i++)
            {
                arr[2*i] = arrpos.get(i);
                arr[2*i+1] = arrneg.get(i);
            }

            int j = arrpos.size()*2;
            for(int i=arrpos.size();i<arrneg.size();i++)
            {
                arr[j]=arrneg.get(i);
                j++;
            }
        }

        else
        {  
            
            for(int i=0;i<arrneg.size();i++)
            {
                arr[2*i] = arrpos.get(i);
                arr[2*i+1] = arrneg.get(i);
            }
            
            int j = arrneg.size()*2;
            for(int i=arrneg.size();i<arrpos.size();i++)
            {
                arr[j]=arrpos.get(i);
                j++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,-4,-5,3,5,6,7,8,9};
        rearraneElementsUnEven(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
