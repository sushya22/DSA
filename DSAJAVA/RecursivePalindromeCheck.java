package DSAJAVA;
public class RecursivePalindromeCheck {

    public static boolean checkPalindrome(String s,int left, int right)
    {
        if(left<right)
        {
           if(s.charAt(left)==s.charAt(right))
           {
             return checkPalindrome(s,left+1,right-1);
           }
           return false;
        }

        return true;
    }
    public static void main(String args[])
    {
        String s = "SuSh";
        System.out.println(checkPalindrome(s,0,s.length()-1));
    }
}
