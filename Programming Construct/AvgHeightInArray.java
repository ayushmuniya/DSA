import java.util.*;


class AverageHeight{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = Float.parseFloat(sc.next());
        }

        float avgHeight = averageHeight(n, a);
        System.out.println(avgHeight);
    }

    // TODO: Implement this method
    static float averageHeight(int n, float[] a){
        float sum = 0; // initializing the sum variable
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        float avg = sum/a.length;
        return avg;
    }
}
