import java.util.*;

class SeriesSumII {
    // NOTE: Please do not modify this function
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double R = sc.nextDouble();

        double result = seriesSumII(A, R);

        System.out.println(result);
    }

    // TODO: Implement this method
    static double seriesSumII(double A, double R) 
    {
        double sum = A/(1-R);
        return sum;
    }
}
