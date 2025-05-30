package DSAJAVA;
public class Recursion1{
    public static int n = 5;
    public static void printName(int count)
    {
       if(count>n)
       {
        return;
       }
       System.out.println("Sushya22_");
       count = count+1;
       printName(count);
    }
    public static void main(String args[])
    {
        printName(1);
    }
}