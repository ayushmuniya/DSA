import java.util.*;

class TrailingZeros {
    // TODO: Implement this method
    static long findTrailingZeros(long n) 
    {
       long res = 0;
       
       if(n<0)
       {
           return 0;
       }
        else 
        {
            for (int i=5; i<=n; i=i*5)
            {
                res = res + n/i;
            }
        }
        return (int) res;
    }
        
        

    // NOTE: Please do not modify this function
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(findTrailingZeros(n));
    }
}
