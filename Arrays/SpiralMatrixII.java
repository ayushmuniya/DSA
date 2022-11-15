class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int[][] ans = new int[n][n];
        
        int numfiller = 1;
        int firstRow= 0; //top
        int lastRow = n-1; //bottom
        int firstColoumn = 0; //left
        int lastColoumn = n-1; //right
        
        while (firstRow <= lastRow && firstColoumn <= lastColoumn) 
        {
    
            // firstRow travelsal from (firstColoumn to lastColoumn)
            for(int i = firstColoumn; i <= lastColoumn; i++ )
             {
                
                ans[firstColoumn][i] = numfiller++;
             }
            
            firstRow ++;
            
            
            // lastColoumn travelsal from (firstRow to lastRow)
             for(int i = firstRow; i <= lastRow; i++ )
             {
                ans[i][lastColoumn] = numfiller++;
             }
            
            lastColoumn --;
    
            
             // lastRow travelsal from (lastColoumn to firstColoumn)
            if (lastRow >= firstRow)
            {
                for(int i = lastColoumn; i >= firstColoumn; i-- )
                 {
                     ans[lastRow][i] = numfiller++;
                 }
                lastRow--;
            }
            
            
            // firstColoumn travelsal from (lastRow to firstRow)
            if (firstColoumn <= lastColoumn)
            {
                for(int i = lastRow; i >= firstRow; i-- )
                 {
                    ans[i][firstColoumn] = numfiller++;
                 }
                firstColoumn ++;      
            }      
            
        }
         return ans;
    }
}
