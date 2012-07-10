package Problem8;

/*
Problem 8
 7 May 2012

Find the greatest product of five consecutive digits in the 1000-digit number.

73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450

   */
import java.util.*;
 
public class Problem8
{
    public static String list = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
    
    public static void main()
    {
      String FiveDigits = "";
      int start = 0,end = 5;
      int greatestProduct = 0;
      int temp = 0;
      
      while(list.length() >= 5)
      {
         FiveDigits = list.substring(start,end);        
         try
         {
            temp = parseList(FiveDigits);
                
            if(temp > greatestProduct)
            {
                 greatestProduct = temp;
                    SOP("\n ----"+FiveDigits+"-----"+temp);
                }
           else
                 temp = 0;
         }
         catch(Exception e){e.printStackTrace();}
         
         list = list.substring(1);
        }
      SOP("\nThe Answer is ");
      SOP("\n"+greatestProduct);
    }
    public static int parseList(String F)
    {
        if(F.indexOf("0") != -1 )
            return 0;
        
        int a,b,c,d,e;
        
        a = Integer.parseInt(F.substring(0,1));
        b = Integer.parseInt(F.substring(1,2));
        c = Integer.parseInt(F.substring(2,3));
        d = Integer.parseInt(F.substring(3,4));
        e = Integer.parseInt(F.substring(4,5));
        
       // SOP("\nDIGITS"+a+""+b+""+c+""+d+""+e+"");
        
        return a*b*c*d*e;
    }
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}