import java.util.*;

class FindElementQuery {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int q = sc.nextInt();

        while (q-- > 0) {

            int x = sc.nextInt();
            int result = findElementQuery(n, arr, x);

            System.out.println(result);

        }

    }

    // TODO: Implement this method
        static int findElementQuery(int n, int[] arr, int x) 
        {
            int left = 0;
            int right = n - 1;
            int index = -1;

            while (left <= right) 
            {
                int mid = left + (right - left) / 2;

                if (arr[mid] == x) 
                {
                    index = mid;
                    right = mid - 1; // continue searching for leftmost occurrence
                } 
                else if (arr[mid] < x) 
                {
                    left = mid + 1;
                } 
                else 
                {
                    right = mid - 1;
                }
            }
            return index;
        }
}
