package Array;

public class MaximumSubArraySum {
    public static int findSubArraySum(int[] arr)
    {
        int maxSubArraySum = 0;
        int tempSubArraySum = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                tempSubArraySum = 0;
                for(int k=i;k<=j;k++)
                {
                    tempSubArraySum+=arr[k];
                }
                
                maxSubArraySum = Math.max(maxSubArraySum, tempSubArraySum);
            }
        }

        return maxSubArraySum;
    }

    public static int findSubArraySumBetter(int[] arr)
    {
        int maxSubArraySum = 0;
        int tempSubArraySum = 0;
        for(int i=0;i<arr.length;i++)
        {   tempSubArraySum = 0;
            for(int j=i;j<arr.length;j++)
            {
                tempSubArraySum+=arr[j];
                maxSubArraySum = Math.max(maxSubArraySum, tempSubArraySum);
            }
        }

        return maxSubArraySum;
    }

    public static int subArraySumOptimal(int[] arr)
    {
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                sum=0;
            }
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int k = 6;
        System.out.println(subArraySumOptimal(arr));
    }
}
