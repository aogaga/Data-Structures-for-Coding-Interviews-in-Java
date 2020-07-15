class Trade{

	public int buy;
	public int sell;

	public Trade(int buy, int sell){
		this.buy = buy;
		this.sell = sell;
	}


	public int profit(){
		return (sell - buy);
	}
}