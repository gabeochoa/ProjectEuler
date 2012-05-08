package Problem6;

/*
Problem 6
Mon Jan 23 2012
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the 
first ten natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the 
first one hundred natural numbers and the square of the sum.
   */
public class Problem6
{
    public static int ex = 10;
    public static int limit = 100;
    public static int sum = 0;
    public static int squareOfSums = 0;
    public static int sumOfSquares = 0;
    
    public static void main()
    {
      for(int i=1; i<limit+1;i++)
      {  
         sum += i; 
         sumOfSquares += i*i;  
      }
      squareOfSums = sum*sum;
      
      SOP("\nThe sum of all the ^2's is ");
      SOP("\n"+sumOfSquares);
      SOP("\nThe ^2 of all the sums is ");
      SOP("\n"+squareOfSums); 
      SOP("\nThe difference is ");
      SOP("\n"+(squareOfSums - sumOfSquares));
    }
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}
