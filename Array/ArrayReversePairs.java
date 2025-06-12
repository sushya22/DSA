package Array;

public class ArrayReversePairs {

    public static void countReversePairs(int[]  arr)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>2*arr[j])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void countReverse
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,2,1,4};
        countReversePairs(arr);
    }
}
