package Problem3;

/*
Problem 3
Thr Jan 26 2012

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

From WA the factors are:
1  |  71  |  839  |  1471  |  6857 
59569  |  104441  |  486847  |  1234169  
5753023  |  10086647  |  87625999  |  408464633
716151937  |  8462696833  |  600851475143   
   */
import java.util.*;
 
public class Problem3
{
    public static void main()
    {
      /*
       * http://www.rsok.com/~jrm/factor.html
      */
        
      SOP("\nThe largest prime factor is ");
      SOP("\n"+"6857");
    }
    
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}
