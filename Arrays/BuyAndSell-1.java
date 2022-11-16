class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int minValueSoFar = prices[0];
        
        for(int i=0; i<prices.length; i++)
        {
            minValueSoFar = Math.min(minValueSoFar, prices[i]);
            maxProfit = Math.max((prices[i] - minValueSoFar), maxProfit);
        }
        return maxProfit;
    }
}
