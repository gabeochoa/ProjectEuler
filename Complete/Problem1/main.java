package Problem1;

/*
 * Problem 1
05 October 2001

If we list all the natural numbers 
below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
   
   */
public class main
{
    public static int a = 1000;
    public static int ex = 10;
    public static void main()
    {
       int sum = 0; 
        
      for(int i=0; i<a; i++)
      {  
            if(i % 3 ==0 || i%5 == 0)
            {
                sum+=i;
            }
      }
      System.out.println("The sum of all the multiples");
      System.out.println("of 3 or 5 below 1000 is:\n "+sum);
    }
    
}
