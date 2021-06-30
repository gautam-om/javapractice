package Interface;

public class Test {
	
	public static void main(String[] args)
    {
		System.out.println(USBank.blcmin);
		
		HDFCBanks h= new HDFCBanks();
		h.credit();
		h.debit();
		h.moneyTranfer();
		h.loan();
		h.hdfctransfer();
		h.mutualFund();
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");		
		USBank us= new HDFCBanks();
		us.credit();
		us.debit();
		us.moneyTranfer();
		
    } 

}
