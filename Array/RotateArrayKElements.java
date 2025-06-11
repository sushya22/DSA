package Array;

public class RotateArrayKElements {
    public static void rotatearrayleft(int[] arr,int k)
    {   k = k%arr.length;
        int temp[] = new int[k];
        for(int i=0;i<k;i++)
        {
            temp[i] = arr[i]; 
        }
        for(int i=k;i<arr.length;i++)
        {
            arr[i-k] = arr[i];
        }
        for(int i=0;i<temp.length;i++)
        {
            arr[arr.length-k+i] = temp[i];
        }
    }

    public static void rotatearrayright(int[] arr,int k)
    {
        int[] temp = new int[k];
        for(int i=arr.length-k;i<arr.length;i++)
        {
            temp[i-arr.length+k] = arr[i];
        }

        for(int i=arr.length-k-1;i>=0;i--)
        {
            arr[i+k] = arr[i]; 
        }

        for(int i=0;i<temp.length;i++)
        {
            arr[i] = temp[i];
        }
    }
    
    public static void reversearray(int[] arr,int left,int right)
    {
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateArrayOptimal(int[] arr,int left,int right,int k)
    {
        k = k%arr.length;
        reversearray(arr,arr.length-k,right);
        reversearray(arr,0,arr.length-k-1);
        reversearray(arr,0,arr.length-1);
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        rotateArrayOptimal(arr,0,arr.length-1,2);
        for(int i:arr)
        {
            System.out.println(i);
        }
        
    }
}
