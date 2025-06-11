package Array;

public class MaximumSubArraySumPrint {

    public static void printMaximumSumArray(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }

                if(sum>maxSum)
                {
                    low = i;
                    high = j;
                    maxSum = sum;
                }
            }
        }

        for(int i=low;i<=high;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static void printMaximumSumArrayBetter(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;
        for(int i=0;i<arr.length;i++)
        {   sum = 0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum>maxSum)
                {
                    low = i;
                    high = j;
                    maxSum = sum;
                }
            }
        }

        for(int i=low;i<=high;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void printMaximumSumArrayOpt(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;
        for(int i=0;i<arr.length;i++)
        {   
            if(sum==0)
            {
                low = i;
            }
            sum+=arr[i];
            if(sum<0)
            {
               sum = 0; 
            }
            
            if(sum>=maxSum)
            {
               maxSum = Math.max(sum,maxSum);
               high = i;
            }
        }

        for(int i=low;i<=high;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 6;
        printMaximumSumArrayOpt(arr);
    }
}
