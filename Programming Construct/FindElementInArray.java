import java.util.*;

class FindElement {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int result = findElement(n, arr, x);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int findElement(int n, int[] arr, int x) 
    {
        //iterate through the whole array to check at which index the number 'x' is present
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] == x) //check value at each index of array and compare with 'x'
            {
                return i;  // return the index 
            }   
        }
        return -1;  // return -1 if not persent (after loop is done iterating)
    }
}
