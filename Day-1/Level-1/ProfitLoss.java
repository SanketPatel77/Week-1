class ProfitLoss{
	public static void main(String [] args){
		float costPrice = 129;
		float sellingPrice = 191;
		
		float profit = sellingPrice - costPrice;
		float percentage = ( (profit / costPrice) * 100 );
		
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\n"+"The Profit is INR "+profit+" and the Profit Percentage is "+percentage);
	}
}