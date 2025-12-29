package com.onlineBanking;

import java.util.Random;
import java.util.Scanner;

public class Transaction  {
	
	private String  recipientName, bankId, recipientReference;
	private long recipientAccNum, acctNumber;
	private double amount, balance;

	Scanner Input = new Scanner (System.in);
	Scanner Input2 = new Scanner(System.in);
	Bank n = new Bank ();
	Customer a = new Customer ();
	
		// default constructor
		public Transaction () {
			
			balance = a.Balance;
			acctNumber=a.accNum;
			recipientName ="null";
			recipientAccNum = 0;
				
		}
			
			// setter method
			public void setTransactions(String b, long RA, double a, String RN, String RR) {

					bankId = b;
					recipientAccNum = RA;
					amount = a;
					recipientName = RN;
					recipientReference = RR;

					transferFund(amount);

			}
	
			//  this method is to ensure the customer is able to do online transfer
				 public void transferFund (double a){

				        if (a < 0) { // if transfer amount is negative

				        System.out.println ();
				        System.out.println ("Error! The amount that u tried transferring is invalid.");
				        System.out.println ("Owner's account number: " + acctNumber);
				        System.out.println ("Requested amount: RM " + a);

				        }

				        else
				        if (a > balance){ // transfer amount exceeds balance

				        System.out.println ();
				        System.out.println ("Error! Insufficient funds available.");
				        System.out.println ("Owner's account number: " + acctNumber);
				        System.out.println ("Requested amount: RM " + a);
				        System.out.println ("Available balance: RM " + balance);

				        }

				        else {


				        System.out.println();
				        System.out.println(getOTP(4));
				        	totalBalance(a);
				        System.out.println("You have successfully transferred the fund to " + recipientName);
				        System.out.println(toString());
				        }

				    }
			 
			 // processor method - this method will calculate the total balance after customer transferred the funds
			 public double totalBalance (double Amount) { return balance = balance - Amount; }
			 
			 // getter method
			 public double getBalance() { return balance ;}


			 // method for One Time Password - OTP / getter method
				private static char [] getOTP(int length)throws IllegalArgumentException{

				      System.out.print("One Time Password (OTP): ");
				        String Number="012345678"; // the OTP numbers will be selected within these range of number
				        char Otp[]=new char[length];
				        Random getOtpNumber=new Random();
				        for (int i =0;i < length; i++){
				        Otp[i]=Number.charAt(getOtpNumber.nextInt(Number.length()));
				        }
				        return Otp;

				    }
				  
		//printer method
		 public String toString () {
					
		 return "\n\tTRANSACTION DETAILS\n\n\tRecipient name: " +recipientName+
				 "\n\tBank name: " + n.getBankName(bankId)+
				 "\n\tAccount number: " + recipientAccNum+
				 "\n\tAmount: RM "+amount+
				 "\n\tRecipient reference: " +recipientReference+
				 "\n\n\t\tTHANK YOU";
		 }
	 
	 
}
