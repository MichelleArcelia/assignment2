/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Michelle Neptune
 * @date October 10, 2020
 * PART 2
 */

//==========================================================================================================================
//======================================================= IMPORTS ==========================================================
//==========================================================================================================================	

package com.meritamerica.assignment2;

import java.util.Arrays;

//==========================================================================================================================
//====================================================== VARIABLES =========================================================
//==========================================================================================================================	
	
	public class AccountHolder {
	
		private String firstName;
		private String middleName;
		private String lastName;
		private String ssn;
		CheckingAccount[] checkingStorage = new CheckingAccount[0];
		SavingsAccount[] savingsStorage = new SavingsAccount[0];
		CDAccount [] cdAccountStorage = new CDAccount[0];
		private double totalBalance;

//==========================================================================================================================
//======================================== CONSTRUCTOR - ACCOUNT HOLDER DETAILS ============================================
//==========================================================================================================================	
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		
		this.firstName = firstName;
		this.middleName = middleName; 
		this.lastName = lastName; 
		this.ssn = ssn;
	} 
	
//==========================================================================================================================
//==================================================== GET & SET METHODS ===================================================
//==========================================================================================================================
	
// ===== FIRST NAME ===== 

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

// ===== MIDDLE NAME ===== 

	public String getMiddleName() {
		return middleName;
	}
		
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

// ===== LAST NAME ===== 

	public String getLastName() {
		return lastName;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

// ===== SSN ===== 

	public String getSSN() {
		return ssn;
	}
		
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

//==========================================================================================================================
// ================================================ CHECKING ACCOUNT METHODS ===============================================
//==========================================================================================================================
	
//******************************** PART 1 OF CHECKING - Opening Balance to Checking Account ******************************** 
	
//TOP OF METHOD: checks to see if combined balances are less than 250,000	
//BOTTOM OF METHOD: ONLY Opening Balance of the checking Account is added to the Account Holder - Adding items to an Array
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		totalBalance = getCheckingBalance() + getSavingsBalance() + openingBalance;
		
		if(totalBalance > 250000) {
			System.out.println("WARNING! A new Checking account can not be opened until the combined balances of your current accounts are below $250,000.");
		
	}
		
		CheckingAccount newX = new CheckingAccount(openingBalance);
		CheckingAccount[] newCheckingStorage = new CheckingAccount[checkingStorage.length+1];
			for(int i = 0; i < newCheckingStorage.length-1; i++) {
				newCheckingStorage[i] = checkingStorage[i];
			}
			checkingStorage = newCheckingStorage;
			return checkingStorage[checkingStorage.length-1] = newX;
	}
	
// ***************************** PART 2 OF CHECKING - Adding Amount (not opening balance) to Checking Account *************** 
	
//TOP OF METHOD: checks to see if combined balances are less than 250,000	
//BOTTOM OF METHOD: ONLY Opening Balance of the checking Account is added to the Account Holder - Adding items to an Array
		
		public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
			
			totalBalance = checkingAccount.getBalance() + getCheckingBalance() + getSavingsBalance();
			
			if(totalBalance > 250000) {
				System.out.println("WARNING! A new Checking account can not be opened until the combined balances of your current accounts are below $250,000.");
			
		}
		
			CheckingAccount newCheckingStorage = new CheckingAccount(checkingStorage.length+1);
			
				for(int i = 0; i < newCheckingStorage.length-1; i++) {
					newCheckingStorage[i] = checkingStorage[i];
				}
				checkingStorage = newCheckingStorage;
				return checkingStorage[checkingStorage.length-1] = checkingAccount;
		}
	
// ************************************* PART 3 OF CHECKING: Returns the Checking Account *************************************  	
	
	public CheckingAccount[] getCheckingAccounts() {
		System.out.println("TESTING - CHECKING ACCOUNT IS" + checkingStorage);
		return checkingStorage;
	}
	
// *************************** PART 4 OF CHECKING: Will return the total number of Checking Accounts ************************** 	
	
	public int getNumberOfCheckingAccounts() {
		System.out.println("TESTING - Total Number of CHECKING Accounts:" + checkingStorage.length);
		return checkingStorage.length;
	}
	
// **************************** PART 5 OF CHECKING: Add up the total balance of the checking accounts ************************* 	
	
	double getCheckingBalance() {
		double totalBalance = 0;
		for(int i = 0; i < checkingStorage.length; i++) {
			totalBalance = totalBalance + checkingStorage[i].getBalance();
		}
		System.out.println("TESTING - TOTAL BALANCE OF CHECKING ACCOUNTS" + totalBalance);
		return totalBalance;
	}

//==========================================================================================================================
// ================================================ SAVINGS ACCOUNT METHODS ================================================
//==========================================================================================================================
	
//********************************** PART 1 OF SAVINGS - Opening Balance to Savings Account ******************************** 
	
//TOP OF METHOD: checks to see if combined balances are less than 250,000	
//BOTTOM OF METHOD: ONLY Opening Balance of the savings Account is added to the Account Holder - Adding items to an Array
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		
		totalBalance = getCheckingBalance() + getSavingsBalance() + openingBalance;
		
		if(totalBalance > 250000) {
			System.out.println("WARNING! A new Savings account can not be opened until the combined balances of your current accounts are below $250,000.");
		
	}
		
		SavingsAccount newX = new SavingsAccount(openingBalance);
		SavingsAccount[] newSavingsStorage = new SavingsAccount[savingsStorage.length+1];
			for(int i = 0; i < newSavingsStorage.length-1; i++) {
				newSavingsStorage[i] = savingsStorage[i];
			}
			savingsStorage = newSavingsStorage;
			return savingsStorage[savingsStorage.length-1] = newX;
	}
	
// ***************************** PART 2 OF SAVINGS - Adding Amount (not opening balance) to Savings Account *************** 
	
//TOP OF METHOD: checks to see if combined balances are less than 250,000	
//BOTTOM OF METHOD: ONLY Opening Balance of the savings Account is added to the Account Holder - Adding items to an Array
			
		public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
				
			totalBalance = savingsAccount.getBalance() + getCheckingBalance() + getSavingsBalance();
				
			if(totalBalance > 250000) {
				System.out.println("WARNING! A new Savings account can not be opened until the combined balances of your current accounts are below $250,000.");
				
			}
			
			SavingsAccount newSavingsStorage = new SavingsAccount(savingsStorage.length+1);
				
				for(int i = 0; i < newSavingsStorage.length-1; i++) {
					newSavingsStorage[i] = savingsStorage[i];
				}
				checkingStorage = newSavingsStorage;
				return savingsStorage[savingsStorage.length-1] = SavingsAccount;
		}	
	
// ************************************* PART 3 OF SAVINGS: Returns the Savings Account ***************************************  	
	
		public SavingsAccount[] getSavingsAccount() {
			System.out.println("TESTING - SAVINGS ACCOUNT IS" + savingsStorage);
			return savingsStorage;
		}
		
// *************************** PART 4 OF SAVINGS: Will return the total number of savings Accounts *********************** 	
		
		public int getNumberOfSavingsAccounts() {
			System.out.println("TESTING - Total Number of Savings Accounts:" + savingsStorage.length);
			return savingsStorage.length;
		}
		
// ************************** PART 5 OF SAVINGS: Add up the total balance of the savings accounts ************************ 	
		
		double getSavingsBalance() {
			double totalBalance = 0;
			for(int i = 0; i < savingsStorage.length; i++) {
				totalBalance = totalBalance + savingsStorage[i].getBalance();
			}
			System.out.println("TESTING - TOTAL BALAANCE OF SAVINGS ACCOUNTS" + totalBalance);
			return totalBalance;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// ===== CD ACCOUNT ===== 	
	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
		
	}
	
	
	CDAccount addCDAccount(CDAccount cdAccount) {
		
		
	}
	
	
	CDAccount[] getCDAccounts() {
		
		
	}
	
	
	int getNumberOfCDAccounts() {
		
		
	}
	
	
	double getCDBalance() {
		
		
	}
	
	
	double getCombinedBalance() {
		
		
	}

	
	
	
	
}

/*
// ***************** OUTPUT *****************
		
	public String toString() {

		return ("\n Name: " + firstName + " " + middleName + " " + lastName + 
		"\n SSN:" + getSSN() +
		"\n Checking Account Balance: " + openingBalance +
		"\n Checking Account Interest Rate: " + interestRate +
		"\n Checking Account Balance in 3 years: ?????????????? \n" + 
		"\n" + updatedSavings.toString() );
		//"\n" + updatedChecking.toString()); 
		
		

	}

}




//double checkingAccountOpeningBalance;
//double savingsAccountOpeningBalance;

/*CheckingAccount updatedChecking;
SavingsAccount updatedSavings;


private int checkingAccountNumber = 0;
private int savingsAccountNumber = 0;
private int cdAccountNumber = 0;


double openingBalance = 100;
private static double interestRate = 0.01;




this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 

updatedChecking = new CheckingAccount(checkingAccountOpeningBalance);

updatedSavings = new SavingsAccount(savingsAccountOpeningBalance);
*/




//this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
//this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 

//updatedChecking = new CheckingAccount(checkingAccountOpeningBalance);

//updatedSavings = new SavingsAccount(savingsAccountOpeningBalance);







/*


double totalBalance = 0;
double totalChecking = 0;
double totalSaving = 0;
double testingAdd = openingBalance;

totalChecking = this.getCheckingBalance();
totalSaving = this.getSavingsBalance();
totalBalance = this.getCheckingBalance();

totalBalance = totalChecking + totalSaving + testingAdd;

if(totalBalance > 250000) {
	System.out.println("WARNING! New accounts can not be opened until the combined balances of your current accounts are below $250,000.");








this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
}*/
 