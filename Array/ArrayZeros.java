package Array;

public class ArrayZeros {
    public static void movezeroes(int[] arr)
    {
        int[] temp = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
               temp[j] = arr[i];
               j++;
            }
        }
        
        for(int i:temp)
        {
            System.out.println(i);
        }
    }

    public static void movezeroesopt(int[] arr)
    {    
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    public static void movezeroesbetter(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            while(arr[i]!=0 && i<j)
            {
                i++;
            }

            while(arr[j]==0 && j>i)
            {
                j--;
            }

            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {0,3,5,7,0,2,4,6,0,0};
        movezeroesbetter(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }

    }
}
