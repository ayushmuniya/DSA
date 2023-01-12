import java.util.*;

class MaxSumTriplet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int result = maxSumTriplet(n, arr);

            System.out.println(result);

        }

    }

    static int maxSumTriplet(int n, int arr[]) 
    {
        int ans = 0;
 
        for (int i = 1; i < n - 1; ++i) {
            int max1 = 0, max2 = 0;
 
            // find maximum value(less than arr[i])
            // from 0 to i-1
            for (int j = 0; j < i; ++j)
                if (arr[j] < arr[i])
                    max1 = Math.max(max1, arr[j]);
 
            // find maximum value(greater than arr[i])
            // from i+1 to n-1
            for (int j = i + 1; j < n; ++j)
                if (arr[j] > arr[i])
                    max2 = Math.max(max2, arr[j]);
 
            // store maximum answer
        if(max1 > 0 && max2 > 0)
            ans = Math.max(ans, max1 + arr[i] + max2);
        }
 
        return ans;
    }
}
