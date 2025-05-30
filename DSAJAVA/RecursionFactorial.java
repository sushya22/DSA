package DSAJAVA;
import java.util.Scanner;
public class RecursionFactorial {
    

    public static int factorial(int i)
    {
        if(i<=1)
        {
            return 1;
        }
        return i * factorial(i-1);
    }
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(factorial(n));
    }
}
