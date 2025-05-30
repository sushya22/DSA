package DSAJAVA;
public class ReverseAnArray {
    public static void reverseAnArray(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
            reverseAnArray(arr,left,right);
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,2,8,9};
        reverseAnArray(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
