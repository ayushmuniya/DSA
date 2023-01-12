import java.util.*;

class TwoSumInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) 
    {
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = (i + 1); j < n; j++) 
            {
                if (arr[i] + arr[j] == k) 
                {
                    return true;
                }
            }
        }
 
        return false;
    }
}
