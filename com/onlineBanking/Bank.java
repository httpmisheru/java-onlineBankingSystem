package com.onlineBanking;

public class Bank { 
	
	protected static String bank_name;
	String bank_id;
	
	//default constructor
	public Bank () {
		
		bank_name = "Null";
		bank_id = "Null";
		
	}

	// getter method
	public String getBankName (String bank_id) {
		
		switch (bank_id.toUpperCase()) {
		
			case "BSN":
				bank_name = "BANK SIMPANAN NASIONAL";
				break;
			case "MBB":
				bank_name = "MAYBANK";
				break;
			case "ALM":
				bank_name = "ALLIANCE BANK";
				break;
			case "BIB":
				bank_name= "BANK ISLAM";
				break;
			case "AMB":
				bank_name= "AmBANK";
				break;
			case "CIMB":
				bank_name= "CIMB BANK";
				break;
				
			
		}
		return bank_name;
		
	}
	
}
