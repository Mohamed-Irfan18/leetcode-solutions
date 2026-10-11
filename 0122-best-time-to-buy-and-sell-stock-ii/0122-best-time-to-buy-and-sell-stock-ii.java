class Solution 
{
    public int maxProfit(int[] prices)
    {
        int len = prices.length;

        int total =0;

        for(int i=1; i<len; i++)
        {
            if(prices[i] > prices[i-1])
            {
                total += prices[i] - prices[i-1];
            }
        }

        return total;
        
    }
}