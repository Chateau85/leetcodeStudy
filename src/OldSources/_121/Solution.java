package OldSources._121;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 7, 1, 5, 3, 6, 4 };

		System.out.println(maxProfit(prices));
		System.out.println(maxProfit2(prices));
	}

	private static int maxProfit2(int[] prices) {
		int min = Integer.MAX_VALUE, max = 0;
		for (int price : prices) {
			min = Math.min(min, price);
			max = Math.max(price - min, max);
		}
		return max;
	}

	private static int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int result = 0;
		int minValue = prices[0];

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > minValue) {
				result = Math.max(result, prices[i] - minValue);
			} else {
				minValue = prices[i];
			}
		}
		return result;
	}

}
