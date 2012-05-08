package Problem9;

/*
Problem 9
Start:  Sat Jan 28 2012
End: 
A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
   */
import java.util.*;
 
public class Problem9
{

    public static void main()
    {
      double a,b,c;  
      int limit = 1000;
      for(int i= 1; i <=limit;i++)
      {
          a = i;
          for(int j= 1; j <=limit;j++)
        { 
            b = j;
            
            c = Math.sqrt((a*a) + (b*b));
            if( (a + b + c) == 1000)
            {
                SOP("\nThe legs that = 1000 are "+a+" , "+b+" , "+c);
                SOP("\nThe product is "+(a*b*c));
            }
        }
      }
    }
    
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}
