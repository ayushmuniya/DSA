import java.util.*;

class ZeroOnes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = zeroOnes(n, a);
        System.out.println(res);

    }

    static int zeroOnes(int n, int a[]) 
    {
        int low = 0;
        int high = n - 1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (a[mid] == 1) 
            {
                if (mid == 0 || a[mid - 1] == 0) 
                {
                    return mid;
                } 
                else 
                {
                    high = mid - 1;
                }
            } 
            else 
            {
                low = mid + 1;
            }
        }
        return -1;
    }
}
