package Array;

public class LinearSearch {
    public static int linearSearch(int[] arr,int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr= new int[] {1,3,5,7,9,2,4,6,8,0};
        System.out.println(linearSearch(arr,7));
    }
}
