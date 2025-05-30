package DSAJAVA;
import java.util.Scanner;
public class RecursionFibonacci {
    public static int fibonnaci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonnaci(n));
    }
}
