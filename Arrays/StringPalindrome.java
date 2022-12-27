import java.io.*;
import java.math.*;
import java.util.*;

public class  PermutationPalindrome 
{

  public static int isPermutationPalindrome(String s) 
  {
    
        int NO_OF_CHARS = 256;

        // Create a count array and initialize all
        // values as 0
        int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);
 
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < s.length(); i++)
            count[(int)(s.charAt(i))]++;
 
        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) 
        {
            if ((count[i] & 1) == 1)
                odd++;
 
            if (odd > 1)
                return 0;
        }
 
        // Return true if odd count is 0 or 1,
      return 1;
  }

  public static void  main (String args []) 
  {

    Scanner sc =  new  Scanner (System.in);
    int t = 1;
    t = sc.nextInt();
    sc.nextLine();
    while (t > 0) 
    {
      t--;
      String s = new String();
      s = sc.next();

      int flag = isPermutationPalindrome(s);
      if (flag == 1) 
      {
        System.out.println("True");
      } else 
      
      {
        System.out.println("False");
      }
    }
  }

}
