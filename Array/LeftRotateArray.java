package Array;

public class LeftRotateArray {
    public static int[] rotatearray(int[] arr)
    {
        int[] temp = new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        return temp;
        //time complexity O(N)
        //Space complexity O(N)
    }

    public static void rotatearrayopt(int[] arr)
    {   
        int temp = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String args[])
    {
        int[] arr = new int[] {0,1,2,3,4};
        int[] temp;
        // temp = rotatearray(arr);
        rotatearrayopt(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
