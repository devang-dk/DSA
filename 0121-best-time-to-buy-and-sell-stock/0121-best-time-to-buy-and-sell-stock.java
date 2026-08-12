class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int num: prices){
            minprice = Math.min(minprice, num);
            maxprofit = Math.max(maxprofit, num-minprice);
        }
        return maxprofit;
    }
}