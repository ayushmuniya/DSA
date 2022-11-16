import java.io.*;
import java.util.*;

public class BestTimeToBuyAndSellStocks {
    // Implement your solution Here
    public int maxProfit(int[] prices) 
    {
        int totalProfit = 0;

        for(int i =1 ; i<prices.length; i++)
        {
            
            totalProfit = totalProfit + Math.max(prices[i]- prices[i-1],0);

        } return totalProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[scanner.nextInt()];
        for (int i = 0; i < prices.length; i++)
            prices[i] = scanner.nextInt();
        scanner.close();

        int result = new BestTimeToBuyAndSellStocks().maxProfit(prices);
        System.out.print(Integer.toString(result));
    }
}

