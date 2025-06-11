package Array;

public class CheckArraySort {

    public static void checkSort(int[] arr)
    {
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    sorted = false;
                    break;
                }
            }

            if(!sorted)
            {
                break;
            }
        }
        System.out.println(sorted);
    }

    public static void checkSortOpt(int[] arr)
    {
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                sorted=false;
            }
        }
        System.out.println(sorted);
    }

    public static void main(String[] args)
    {
      int[] arr = new int[] {1,3,5,7,9,1};
      checkSortOpt(arr);
    }
    
}
