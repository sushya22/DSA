package Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class PascalsTriangle {

    public static int printNcR(int row,int column)
    {
        int ans = 1;
        for(int i=0;i<column;i++)
        {
            ans = ans * (row-i);
            ans = ans / (i+1);
        }
        return ans;
    }

    public static void printRow(int n)
    {
        int ans = 1;
        System.out.println(ans);
        for(int i=1;i<n;i++)
        {
            ans = ans * (n-i);
            ans = ans / i;
            System.out.println(ans);
        }
    }

    public static ArrayList<Integer> generateRow(int n)
    {
        int ans = 1;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(ans);
        for(int i=1;i<n;i++)
        {
            ans = ans * (n-i);
            ans = ans / i;
            temp.add(ans);
        }
        return temp;
    }

    public static void printPascaltriangle(int n)
    {
          ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
          for(int i=1;i<=n;i++)
          {
            result.add(generateRow(i));
          }

           for(ArrayList<Integer> i:result)
           {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
           }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int column = sc.nextInt();
        // System.out.println(printNcR(row-1, column-1));
        int n = sc.nextInt();
        printPascaltriangle(n);

    }
}
//1. given n and c print number