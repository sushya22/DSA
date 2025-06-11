package Array;

public class ArrayElementsOccurence {

    public static void singleoccurence(int[] arr)
    {
        int xor = 0;
        for(int i:arr)
        {
            xor = xor ^ i;
        }

        System.out.println(xor);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,2,3,3,4,1,5,5};
        singleoccurence(arr);
    }
}
