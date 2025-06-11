package Patterns;
import java.util.Scanner;
public class PatternJava {

    public static void print1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.err.println();
        }
        
    }
    public static void print2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.err.println();
        }
        
    }
    public static void print3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.err.println();
        }
        
    }
    public static void print4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.err.println();
        }
        
    }
    public static void print5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }
        
    }
    public static void print6(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.err.println();
        }
        
    }
    public static void print7(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("  ");
            }

            for(int j=0;j<2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }
        
    }
    public static void print8(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }

            for(int j=0;j<2*n-2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }
        
    }
    public static void print9(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int stars = i;
            if(i>n) 
            {
                stars = 2*n-i;
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("* ");
            }
             
            System.out.println();
        
        }
        
    }
    public static void print10(int n)
    {
        for(int i=0;i<n;i++)
        {
            int start = 1;
            if(i%2==1)
            {
                start = 0;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(start+" ");
                start = 1 - start;
            }

            System.out.println();
        }
        
    }
    public static void print11(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }

            for(int j=1;j<=2*n-2*i;j++)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
        
    }
    public static void print12(int n)
    {   
        int count = 1;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }
        
    }
    public static void print13(int n)
    {   
        
        for(int i=1;i<=n;i++)
        {   
            char ch = 'A';
            
            for(char j='A';j<'A'+i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void print14(int n)
    {   
        
        for(char i='A';i<'A'+n;i++)
        {   
            char ch = 'A';
            
            for(char j='A';j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    public static void print15(int n)
    {   
        for(int i=1;i<=n;i++)
        {   
            char j = 'A';

            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            
            for(j='A';j<'A'+i-1;j++)
            {
                System.out.print(j+" ");
            }

            for(;j>='A';j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void print16(int n)
    {   
        for(int i=1;i<=n;i++)
        {   
            int ch = 'E'+1-i;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch);
                ch = ch+1;
            }
            System.out.println();
        }
        
    }
    public static void print17(int n)
    {   
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<2*i-2;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<2*n-2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void print18(int n)
    {   
        for(int i=1;i<2*n;i++)
        {   
            int stars = i;
            if(i>n)
            {
              stars = 2*n-i;
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("* ");
            }
            
            int spaces = 2*n-2*i;
            if(i>n)
            {
               spaces = (i - n)*2;
            }
            for(int j=0;j<spaces;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=stars;j++)
            {
                System.out.print("* ");
            }
           System.out.println();
        }

        
        
    }
    public static void print19(int n)
    {   
       for(int i=1;i<=n;i++)
       {
         if(i==1 || i==n)
         {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
         }
         else
         {
            for(int j=1;j<=1;j++)
            {
                System.out.print("* ");
            }

            for(int j=1;j<=n-2;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=1;j++)
            {
                System.out.print("* ");
            }
         }

         System.out.println();
       }
    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       print19(n);
    }
}
