class StockPrices{
   public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 2, 5};
        
        int [] result = findBuySellStockPrices(array);
        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result[0], result[1]));

        int[] array2 = {8, 6, 5, 4, 3, 2, 1};
        int [] result2 = findBuySellStockPrices(array2);
        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result2[0], result2[1]));

    }

	public static int [] findBuySellStockPrices(int [] arr){
		int [] result = new int[2];
		int buy = arr[0];
		int sell = arr[1];

		int profit = sell - buy;

		int currentProfit = -243534;

		for(int i = 1; i < arr.length; i++){
			currentProfit = arr[i] - buy; 
			if(currentProfit > profit){
				profit = currentProfit;
				sell = arr[i];
			}

			if (buy > arr[i]) {
				buy = arr[i];
			}
		}


		result[0] = (sell - profit);
		result[1] = sell;

		return result;
	}
}