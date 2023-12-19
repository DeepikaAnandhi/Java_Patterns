package com.slidingWindow;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 14};
		System.out.println(maxProfit(prices));
	}

	private static int maxProfit(int[] prices) {
		
		int buyPrice = prices[0];
		int maxProfit = 0;
		int currentProfit = 0;
		
		// 7 1 5 3 6 4
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<buyPrice) {
				buyPrice=prices[i];
			}else {
				currentProfit = prices[i]-buyPrice;
				if(maxProfit<currentProfit) {
					maxProfit = currentProfit;
				}
			}
		}
		return maxProfit;
		
	}

}
