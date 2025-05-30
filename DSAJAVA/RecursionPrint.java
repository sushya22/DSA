package DSAJAVA;
public class RecursionPrint{

    public static void print1ToN(int i,int N)
    {
        if(i>N)
        {
            return;
        }
        System.out.println(i);
        i++;
        print1ToN(i, N);
    }
    
    public static void print1ToNReverse(int i)
    {
        if(i<1)
        {
            return;
        }
        print1ToNReverse(i-1);
        System.out.println(i);
    }


    public static void printNTo1(int i,int N)
    {
        if(i>N)
        {
            return;
        }
        printNTo1(i+1, N);
        System.out.println(i);
    }

    public static void printNTo1Reverse(int i)
    {
        if(i==0)
        {
            return ;
        }
        System.out.println(i);
        printNTo1Reverse(i-1);
    }
    public static void main(String args[])
    {
        //    print1ToN(1,5);
        //    print1ToNReverse(5);
        // printNTo1(1,5);
        printNTo1Reverse(5);
    }
}