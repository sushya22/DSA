package Array;

public class SecondLargestElement {

    public static int secondlarge(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int secondLarge = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > secondLarge && arr[i]!=max)
            {
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    } 

    public static int findSecondLarge(int[] arr)
    {
        int secondLarge = Integer.MIN_VALUE;
        int max= arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>max)
           {
            secondLarge = max;
            max = arr[i];
           } 

           if(arr[i]!=max && arr[i]>secondLarge)
           {
            secondLarge = arr[i];
           }
        }
        return secondLarge;
    }
    public static void main(String[] args)
    {
         int[] arr = new int[] {1,3,5,7,9,2,4,6,8,0};
         System.out.println(secondlarge(arr));
         System.out.println(findSecondLarge(arr));
    }
}
