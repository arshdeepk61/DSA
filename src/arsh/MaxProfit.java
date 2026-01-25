package arsh;

public class MaxProfit {

    public static void main(String[] args) {
        //input: prices = [7,1,5,3,6,4]
        //Output: 5
        //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        //Example 2:
        //
        //Input: prices = [7,6,4,3,1]

        int[] prices = new int[]{ 7,6,4,3,1};
        int min=prices[0];
        int size=prices.length;
        int maxprofit=0;


for(int i=0;i<prices.length;i++)
{
  if(prices[i]<min)
  {
      min=prices[i];

  }
  else
  {
      int profit =prices[i]-min;
      maxprofit=Math.max(profit,maxprofit);
  }

}
        System.out.println(maxprofit);

    }
}
