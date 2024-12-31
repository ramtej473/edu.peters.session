package edu.peters.session;

public class SBIBank {
	public static void main(String[] args) {
		
		int balance;
		SBIBank sbi = new SBIBank();
		
		sbi.withDraw(10000);
		sbi.withDraw(7000);
		sbi.withDraw(1000);
	}

	private int balance;

	private void withDraw(int amt) {
		// TODO Auto-generated method stub
		try {
			if(amt > this.balance) {
				System.out.println("amt "+amt+" trying to withdraw...");
				throw new InSufficientBalanceException(null);
				
			}
			else {
				System.out.println("successfully withdrawn amount...."+amt);
				this.balance = this.balance - amt;
			}
		}catch(InSufficientBalanceException e) {
			System.out.println("error occurred during with draw...");
			e.printStackTrace();
		}
			
		}
		

	
	}	
		
	
