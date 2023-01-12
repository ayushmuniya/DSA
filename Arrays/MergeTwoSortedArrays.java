import java.io.*;
import java.util.*;

public class MergeSortedArray {
    // Implement your solution by completing the below function
    public static int [] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) 
    {
        //new array of size m+n
        int [] ans = new int [m + n];

        //two pointers
        int i = 0;
        int j = 0;

        //index of ans array
        int k = 0;

        while(i<m && j<n)
        { 
            if(nums1[i] < nums2[j])
            {
                ans[k] = nums1[i];
                i++;
                k++;
            }
            else
            {
                 ans[k] = nums2[j];
                 j++;
                 k++;
            }
        }

        while (i<m)
        {
            ans[k] = nums1[i];
            i++;
            k++;
        }

        while (j<n)
        {
            ans[k] = nums2[j];
            j++;
            k++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++)
            nums1[i] = scanner.nextInt();
        for (int i = 0; i < n; i++)
            nums2[i] = scanner.nextInt();

        scanner.close();

        int[] nums = mergeSortedArray(nums1, m, nums2, n);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}
