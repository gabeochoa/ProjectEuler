package Problem4;

/*
Problem 4
Sat Jan 28 2012

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.

Find the largest palindrome made from the product of two 3-digit numbers.
   */
import java.util.*;
 
public class Problem4
{
    public static int lpalin = 0,temp;
    
    public static void main()
    { 
      int a,b;  
      //First start with the highest 3digit num 999 and go down until find a palindrome
      a = b = 999;
      
      for(int i= a; i>=100; i--)
      {
            for(int j = b; j>= 100; j--)
            {
                temp = i*j;
                if(temp > lpalin && testPalindrome(temp))
                {
                    lpalin = temp;
                }
            }  
      }
        
      SOP("\nThe largest palindrome made from the product of two 3-digit numbers is:");
      SOP("\n"+lpalin);
    }
    public static boolean testPalindrome(int n)
    {
        boolean palindrome = false;
        String pal =""+n;
        int j = pal.length()-1;
        
        for(int i = 0; i<j;i++)
        {
            SOP("\n"+pal);
            
            if(pal.charAt(i) != pal.charAt(j))
            {
               palindrome = false; 
               break;
            }
            else
            {
                palindrome = true;
            }
            j--;
        }
        
        return palindrome;
    }
    public static void SOP(String s)
    {
        System.out.print(s);
    }
}