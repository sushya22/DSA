package Array;

public class Consecutiveone {
    public static void main(String[] args)
    {
        int [] arr = new int[] {1,0,1,1,1,0,1,1};
        int max = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }

            if(arr[i]!=1)
            {
                max = Math.max(max,count);
                count=0;
            }
        }
        System.out.println(max);
    }
}
