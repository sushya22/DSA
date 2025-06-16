package BinarySearch;
import java.util.Scanner;
public class NthRootOfNumber {

    public static int findRoot(int mid,int n,int m)
    {
       int ans = 1;
       for(int i =1;i<=n;i++)
       {
        ans = ans * mid;
       }
       if(ans>m) return 2;
       
       if(ans<m) return 1;

       else return 0;
    }

    public static int findNthroot(int n,int m)
    {
        int ans = -1;
        int left = 1;
        int right = m;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int NthRootMid = findRoot(mid,n,m);
            // System.out.println(NthRootMid);
            if(NthRootMid==0)
            {
                ans = mid;
                return ans;
            }
            else if(NthRootMid==1)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findNthroot(n,m));
    }
}
