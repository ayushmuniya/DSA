import java.util.*;

class Factorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println(result);
    }

    // TODO: Implement this method
    static int factorial(int n) 
    {
        int res = 1;
        
        for (int i = 2; i <= n; i++)
        {
             res *= i;
        }
          
        return res;
    }
}
