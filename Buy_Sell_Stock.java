public class Buy_Sell_Stock {
    public static int BuySell_Stock(int stock[]){
        int Buy_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<stock.length;i++){
            if(Buy_price<stock[i]){ //Profit
                int profit=stock[i]-Buy_price;//todays Profit
                max_profit=Math.max(max_profit,profit);
            }
            else{
                Buy_price=stock[i];
            }
        }
        return max_profit;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
       System.out.println(BuySell_Stock(prices));
    }
}
