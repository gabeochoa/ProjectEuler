

/*
Problem 
 Date


   */
import java.util.*;
 
public class PosSeq
{
      /*** fields ***/
      /*** methods ***/
      /*
      public PosSeq(int seqLength)
      { // constructor
            int val;
            seq = new int[seqLength] ;
            for (int k=0; k<seqLength; k++)
      {
      System.out.println("Enter a positive number: ");
      //missingcode
      seq[k] = val;
      }
      }
      public int getMax()
      {
      // precondition: seq.length > O
      int finalv = value;
      for (int k=l; k<seq.length; k++)
      {
            if (seq [k] > finalv) //statement
            {}
      }
      return finalv;
      }
*/
    
      private int[] seq = {3,6,1,5,8};
      
 public boolean search(int key)
 {
     int k=0;
     while ((k < seq.length) && (seq[k] != key)) k++;
         if (seq[k] == key) return true;
         return false;
        }
}