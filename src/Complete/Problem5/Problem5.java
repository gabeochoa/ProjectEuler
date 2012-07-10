package Problem5;

/*
Problem 5 
Tues Jan 24 2012

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
   */
public class Problem5
{
    public static int[] a = {2,3,4,5,6,7,8,9,10}; 
    public static int[] b = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    
    public static void main()
    {
        int smallest = (int) Math.pow(2,31);
        
        for(int i = 2; i< 300000;i++)
        {
            for(int j = 0; j<a.length;j++)
            {
                //SOP("\n"+i);
                if(i % a[j] == 0)
                {
                    //SOP("  "+a[j]);
                    if(a[j] == 10){
                    if(i<smallest)
                    smallest = i; 
                   }
                }
                else{break;}
            
                
            }
            
        }
        SOP("\n\n"+smallest);
    }
    public static void newmain()
    {  int tip;
       int smallest = tip = (int) Math.pow(2,31);
        
        for(int i = 2; i< tip;i++)
        {
            for(int j = 0; j<b.length;j++)
            {
                //SOP("\n"+i);
                if(i % b[j] == 0)
                {
                    //SOP("  "+a[j]);
                    if(b[j] == 20){
                    if(i<smallest)
                    smallest = i; 
                   }
                }
                else{break;}
            
                
            }
            
        }
        SOP("\n\n"+smallest);
    }
    
    public static void SOP(String s)
    {
        System.out.print(s);
    }
    
}
