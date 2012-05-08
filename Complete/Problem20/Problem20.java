package Problem20;

/*
Problem 20
Start:  Sun Jan 29 2012
End: 

n! means n  (n  1)  ...  3  2  1

For example, 10! = 10  9  ...  3  2  1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
   */
import java.util.*;
 
public class Problem20
{
    public static double fact,ans,sum;
    public static String s;
    public static void main()
    {
        s = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
        sumOfDigits();
        SOP("\nThe sum is "+sum);
    }
    public static void sumOfDigits()
    {
       int len = s.length();
      String[] sa = new String[len];
      for(int i = 0; i< len; i++)
            sa[i] = s.substring(i,i+1);
            
      for(int i = 0; i<len; i++)
      {
         if(!sa[i].equals("."))
         sum += Double.parseDouble(sa[i]);
         SOP("\n"+sa[i]);
      } 
    }
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}
