package com.onlineBanking;
import java.util.Scanner;

public class Customer extends Bank  {

	public String name, userName, passWord;
	public long accNum;
	public double Balance; 
	
	// default constructor for customer a
	 public Customer () {
		 
		 bank_name = "BANK SIMPANAN NASIONAL";
		 bank_id = "BSN";
		 name="KIAH BINTI JALIL";
		 Balance = 120_000.00;
		 accNum = 1234567821;
		 userName="user123";
		 passWord="abc123";
		  
	 }
	 
	 public void logIn () {
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("\nHello please enter username and password");
			System.out.print("\nUsername: "); // use System.out.print if u want the user input beside the question
			userName = scanner.next();
			System.out.print("Password: ");
			passWord = scanner.next() ;
		 
	 }

}
