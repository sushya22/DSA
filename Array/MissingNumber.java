package Array;

public class MissingNumber {

    public static void findmissing(int[] arr)
    {
        boolean found = false;
        for(int i=1;i<=5;i++)
        {   
            found = false;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                   found = true;
                }
            }

            if(!found)
            {
                System.out.println(i);
                break;
            }
        }
    }

    public static void findnumber(int arr[])
    {
        int N = arr.length+1;
        int sum = 0;
        for(int i:arr)
        {
            sum+=i;
        }
        int totalsum = N*(N+1)/2;
        System.out.println(totalsum-sum);
    }

    public static void findnumberxor(int arr[])
    {
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            xor1 = xor1^arr[i];
        }

        for(int j=1;j<=arr.length+1;j++)
        {
            xor2 = xor2 ^ j;
        }

        System.out.println(xor1^xor2);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,3,5,2};
        findnumberxor(arr);
        
    }
}
