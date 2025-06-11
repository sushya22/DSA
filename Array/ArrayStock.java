package Array;

public class ArrayStock {

    public static int maxProfit(int[] arr)
    {
        int maxP = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]-arr[i]>maxP)
                {
                    maxP = arr[j]-arr[i];
                }
            }
        }

        return maxP;
    }

    public static int maxProfitOpt(int[] arr)
    {
        int buyPrice = arr[0];
        int maxProfit = 0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]>buyPrice)
            {
               maxProfit = Math.max(maxProfit,arr[j]-buyPrice);
            }

            if(arr[j]<buyPrice)
            {
                buyPrice = arr[j];
            }
        }

        return maxProfit;
    }
    public static void main(String args[])
    {
        int[] arr = new int[]{7,1,5,3,6,4};
        //output : 5
        System.out.println(maxProfit(arr));
        
    }
}
