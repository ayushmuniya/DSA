static int computeMagicSum(int n)
    {
        int sum = 0;

        //iterate from 1 till n*n
        for(int i=0; i<=n*n; i++)
        {
            //this will calculate sum as 1+2+3+4...9
            sum = sum + i;
        }
        //divide the sum to get the intented sum
        int value = sum/n;
        return value;
    }

    static boolean isRowSumMagic (int n, int[][] grid, int sum)
    {
        for(int i=0; i<n; i++)
        {
            int rowSum = 0; 
            for(int j=0; j<n; j++)
            {
                rowSum = rowSum + grid[i][j];
            }
            // System.out.println(rowSum);
            if((rowSum != sum))
                return false;
        }
        return true;
    }

    static boolean isColoumnSumMagic (int n, int[][] grid, int sum)
    {
        for(int i=0; i<n; i++)
        {
            int colSum = 0;
            for(int j=0; j<n; j++)
            {
                colSum = colSum + grid[j][i];
            }
            // System.out.println(colSum);
            if((colSum != sum))
                return false;
        }
        return true;
    }

    static boolean isDiagonalSumMagic (int n, int[][] grid, int sum)
    {

        int digSum1 = 0;
        int digSum2 = 0;
        for(int i=0; i<n; i++)
        {
            digSum1 = digSum1 + grid[i][i];
            digSum2 = digSum2 + grid[i][n-1-i]; 
        }
        //  System.out.println(digSum1);
        //  System.out.println(digSum2);
        if(((digSum1 != sum) && (digSum2 != sum)))
            return false;
        
        return true;
    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) 
    {
        int sum = computeMagicSum(n);
        // System.out.println(sum);

        boolean isRowSumMagic = isRowSumMagic(n, grid, sum);
        // System.out.println(isRowSumMagic);

        boolean isColoumnSumMagic = isColoumnSumMagic(n, grid, sum);
        // System.out.println(isColoumnSumMagic);

        boolean isDiagonalSumMagic = isDiagonalSumMagic(n, grid, sum);
        // System.out.println(isDiagonalSumMagic);

        if(isRowSumMagic && isColoumnSumMagic && isDiagonalSumMagic)
        {
            return "Yes";
        }
        return "No";

    }
