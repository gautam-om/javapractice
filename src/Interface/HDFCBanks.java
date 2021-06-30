package Interface;

public class HDFCBanks implements USBank // multiple inharitance
{
	// method overriding
	public void credit()
	{
		System.out.println("USBank--credit");
	}

	public void debit()
	{
		System.out.println("USBank--debit");
	}
	public void moneyTranfer()
	{
		System.out.println("USBank-- moneyTransfer");
	}
	//seprate method of the HDFCBanks of the class
	public void hdfctransfer()
	{
		System.out.println("HDFC-- TransferLoan");
	}
	public void loan()
	{
		System.out.println("HDFC-- Loan");
	}
	// method overriding
	
	public void mutualFund()
	{
		System.out.println("UKBAnk -- Mutual Fund");
	}
	

	
}
