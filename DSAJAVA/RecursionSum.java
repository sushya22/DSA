package DSAJAVA;
public class RecursionSum {

    public static int resursiveSum(int n,int sum)
    {
        if(n<=1)
        {
            return sum+n;
        }
        return resursiveSum(n-1, sum+n);

    }
    public static void main(String args[])
    {
        System.out.println(resursiveSum(2,0));
    }
}
