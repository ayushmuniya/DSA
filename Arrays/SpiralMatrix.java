import java.io.*;
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List <Integer> ans = new ArrayList<>();
        
        int m = matrix.length; // rows
        int n = matrix[0].length; // coloumns
        
        int firstRow= 0;
        int lastRow = m-1;
        int firstColoumn = 0;
        int lastColoumn = n-1;
        
        while (firstRow <= lastRow && firstColoumn <= lastColoumn) 
        {
    
            // firstRow travelsal from (firstColoumn to lastColoumn)
            for(int i = firstColoumn; i <= lastColoumn; i++ )
             {
                ans.add(matrix[firstRow][i]);
             }
            
            firstRow ++;
            
            
            // lastColoumn travelsal from (firstRow to lastRow)
             for(int i = firstRow; i <= lastRow; i++ )
             {
                ans.add(matrix[i][lastColoumn]);
             }
            
            lastColoumn --;
    
            
             // lastRow travelsal from (lastColoumn to firstColoumn)
            if (lastRow >= firstRow)
            {
                for(int i = lastColoumn; i >= firstColoumn; i-- )
                 {
                    ans.add(matrix[lastRow][i]);
                 }
                lastRow--;
            }
            
            
            // firstColoumn travelsal from (lastRow to firstRow)
            if (firstColoumn <= lastColoumn)
            {
                for(int i = lastRow; i >= firstRow; i-- )
                 {
                    ans.add(matrix[i][firstColoumn]);
                 }
                firstColoumn ++;      
            }      
            
        }
         return ans;
    }
}
