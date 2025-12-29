package com.onlineBanking;
import java.util.Scanner;

public class onlineBankingSystem{

	public static void main(String[] args) {
		String input02 = "null", bankID, recipient_Name, recipient_Reference;
		int input01;
		double balance, Amount;
		long recipient_AccNum;
		
		
		Customer a = new Customer();
		Transaction b = new Transaction ();
		
			
			Scanner input = new Scanner (System.in);
			Scanner input2 = new Scanner (System.in);
			Scanner input3 = new Scanner (System.in);
			
			
			
			a.logIn();
		
					if (a.userName.equals("user123") && a.passWord.equals("abc123")) {
						
						System.out.println("\n\nYou've successfully logged in to this online banking system");
							
							while (!input02.equals("N") && !input02.equals("n")) { 
								
							// main menu
							System.out.println("\nWelcome!");
							System.out.println("\n\t1 - Check Balance \n\t2 - Transfer Fund");
							
							System.out.print("\nPlease enter your option: ");
							input01 = input.nextInt();
							
							//option 1
							if(input01 == 1) {
								
								  balance = b.getBalance();
								  System.out.println("\nYour account balance: RM " + balance);
							}
							
							// option 2
							else if(input01 == 2) {
                                System.out.println("\n\tTRANSACTION DETAILS - Please fill up everything before making an online transfer");
                                System.out.println("\nBank ID available => \n\tBSN - BANK SIMPANAN NASIONAL\n\tMBB - MAYBANK\n\tALM - ALLIANCE BANK");
                                System.out.println("\tBIB - BANK ISLAM\n\tAMB - AmBANK\n\tCIMB - CIMB BANK");

                                System.out.print("\nPlease enter Bank ID : ");
                                bankID = input2.nextLine().trim().toUpperCase();
                                System.out.print("Please enter recipient account number: ");
                                recipient_AccNum = input2.nextLong();
                                System.out.print("Please enter amount : RM ");
                                Amount = input2.nextDouble();
                                System.out.print("Please enter recipient name: ");
                                recipient_Name = input3.nextLine().toUpperCase();
                                System.out.print("Please enter recipient reference: ");
                                recipient_Reference = input3.nextLine();

								b.setTransactions(bankID,recipient_AccNum,Amount,recipient_Name,recipient_Reference);
							}
							
							System.out.print("\nDo you wish to continue? (Y/N): ");
							input02 = input.next();
							System.out.println("--------------------------------");
							}	
					}
					
					else {
						
						System.out.println("\n\nOh no! incorrect username or password. Please try again later");	
							
					}
			
		
		
	}

}