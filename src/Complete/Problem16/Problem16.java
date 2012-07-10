package Complete.Problem16;

/*
Problem 16
Start:  Sun Jan 29 2012
End: 

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2 ^1000?

   */
import java.util.*;
 
public class Problem16
{
  public static double sum;
   public static void main()
    {
      String s = "10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376";
      int len = s.length();
      String[] sa = new String[len];
      for(int i = 0; i< len; i++)
            sa[i] = s.substring(i,i+1);
            
      for(int i = 0; i<len; i++)
      {
         if(sa[i].equals("E")) 
         {
            break;
        }
          if(!sa[i].equals("."))
         sum += Double.parseDouble(sa[i]);
         SOP("\n"+sa[i]);
      }
      
      SOP("\nThe number is: "+s);
      SOP("\nThe sum of the digits is "+sum);
    
    }
/*
 * WOULD HAVE WORKED BUT JAVA CAN HOLD ENTIRE NUMBER
 * 2^1000
 * JAVA: 1.0715086071862673E301 
 * 
 * WA: 107150860718626732094842504906000
 * 1810561404811705533607443750388370351
 * 0511249361224931983788156958581275946
 * 7291755314682518714528569231404359845
 * 7757469857480393456777482423098542107
 * 4605062371141877954182153046474983581
 * 9412673987675591655439460770629145711
 * 9647768654216766042983165262438683720
 * 5668069376
 
     public static double numbers,digits,sum;
   
    public static void main()
    {
      numbers = Math.pow(2,1000);//(2,15);
      String s = ""+numbers;
      int len = s.length();
      String[] sa = new String[len];
      for(int i = 0; i< len; i++)
            sa[i] = s.substring(i,i+1);
            
      for(int i = 0; i<len; i++)
      {
         if(sa[i].equals("E")) 
         {
            break;
        }
          if(!sa[i].equals("."))
         sum += Double.parseDouble(sa[i]);
         SOP("\n"+sa[i]);
      }
      
      SOP("\nThe number is: "+numbers);
      SOP("\nThe sum of the digits is "+sum);
    
    }
    */
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}
