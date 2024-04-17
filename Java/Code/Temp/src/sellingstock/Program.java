package sellingstock;

public class Program {

	public static void main(String[] args) {
		int prices[] = {7, 1, 5, 3, 6, 4};
		 int buy = prices[0], max_profit = 0;
	        for (int i = 1; i < prices.length; i++) {
	 
	            // Checking for lower buy value
	            if (buy > prices[i])
	                buy = prices[i];
	 
	            // Checking for higher profit
	            else if (prices[i] - buy > max_profit)
	                max_profit = prices[i] - buy;
	        }
		System.out.println(max_profit);

	}

}
