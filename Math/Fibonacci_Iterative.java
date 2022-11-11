import java.util.*;


class NthFibonacciNumber{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacciNumber(n);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int nthFibonacciNumber( int n)
    {
        if (n <= 1)
        {
            return n;
        }

        else return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);

    }
 

}
