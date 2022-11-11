import java.util.*;

class SeriesSumI {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = seriesSumI(n);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int seriesSumI(int n) 
    {
        int result = 0;
        for(int i=1; i<=n; i++)
        {
            int a = 2*i - 1;
            int b = 2*i + 1;
            result = result + a*b;

        }
        return result;
    }
}
