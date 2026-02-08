// Last updated: 08/02/2026, 19:47:41
class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            int sp=prices[i];
            if(sp > bp){
                int profit=sp-bp;
                if(maxp<profit){
                    maxp =profit;
                }

            }
            else{
                bp=prices[i];
            }
        }
        return maxp;
    }
}