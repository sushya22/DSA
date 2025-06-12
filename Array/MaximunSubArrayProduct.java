package Array;

public class MaximunSubArrayProduct {

    public static void findMaximumProduct(int[] arr)
    {
        int maxProduct = 1;
        int product = 1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {   
                product = 1;
                for(int k=i;k<=j;k++)
                {
                   product *= arr[k];
                }

                maxProduct = Math.max(maxProduct,product);
            }
        }

        System.out.println(maxProduct);
    }

    public static void findMaximumProductBetter(int[] arr)
    {
        int maxProduct = 1;
        int product = 1;
        for(int i=0;i<arr.length;i++)
        {   product = 1;
            for(int j=0;j<arr.length;j++)
            {   
                product *= arr[j];
                maxProduct = Math.max(maxProduct,product);
            }
        }

        System.out.println(maxProduct);
    }

    public static void findMaximumProductOpt(int[] arr)
    {
        int maxProduct = 1;
        int Preproduct = 1;
        int Suffixproduct = 1;
        for(int i=0;i<arr.length;i++)
        {   
            Preproduct = Preproduct * arr[i];
            Suffixproduct = Suffixproduct * arr[arr.length-i-1];
            maxProduct = Math.max(maxProduct,Math.max(Preproduct,Suffixproduct));
        }

        System.out.println(maxProduct);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,0};
        findMaximumProductOpt(arr);
    }
}
