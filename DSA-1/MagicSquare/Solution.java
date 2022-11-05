import java.util.*;

public class Solution 
{
    //since square matrix, no of rows = no of colouumns
    static boolean isMagicSquare(int[][] arr) 
    {
        int n = arr.length; //no of rows
        int n1 = arr[0].length; //no of coloumns
        int intentedSum = 0; //assuming or initializing intentedSum to 0

        //keeping i->rows and j->coloumns

        //sum of row1 (i.e intented sum)
        for(int j=0 ; j<n; j++)
        {
            intentedSum = intentedSum + arr[0][j] ; //calculating sum of row1 (or any other row for that matter)
            // this will give sum as 4+9+2=15
        }

        //sum of row2 -> rowN
        int newSum;

        for (int i=1; i<n ; i++) //keeping i=1 as fixing the row 
        {
            newSum=0;
            for (int j=0 ; j<n ; j++) //and then moving/looping across coloumns
            {
                newSum = newSum + arr[i][j]; //moving across coloumns to calculate sum
            }
            if(newSum != intentedSum)  //if sum of rowI != sum of row1 -> return false
            {
                return false;
            }
        }

        //sum of coloumn1 -> coloumnN
        for (int j=1; j<n ; j++) //keeping j=1 as fixing the coloumn
        {
            newSum=0;
            for (int i=0 ; i<n ; i++) //and then moving/looping across rows
            {
                newSum = newSum + arr[i][j]; //moving across rows to calculate sum
            }
            if(newSum != intentedSum)  //if sum of coloumnI != sum of row1 -> return false
            {
                return false;
            }
        }

        //sum of diagonal1 and diagonal2
        int Psum = 0;
        int Ssum = 0;

        for (int i=0; i<n ; i++) // 0,1,2
        {
            Psum = Psum + arr[i][i];
            Ssum = Ssum + arr[i][n-i-1]; // i=0, arr[0][n-1]
                                        // i=1, arr[1][n-2]
                                        //i=2 , arr[2][n-3]
        }
        
        if(Psum!= intentedSum || Ssum!= intentedSum)
        {
            return false;
        }

        return true;



    }

    public static void main(String args[]) {

        int[][] arr1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        assert isMagicSquare(arr1) == true : "Expect true for arr = {{4,9,2}, {3,5,7}, {8,1,6}}";

        int[][] arr2 = {{4,9,2}, {3,5,9}, {8,1,6}};
        assert isMagicSquare(arr2) == false : "Expect false for arr = {{4,9,2}, {3,5,9}, {8,1,6}}";
        System.out.println("All test cases in main function passed");

    }
}
