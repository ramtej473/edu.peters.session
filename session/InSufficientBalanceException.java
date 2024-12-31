package edu.peters.session;

public class InSufficientBalanceException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public InSufficientBalanceException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InSufficientBalanceException [message=" + message + "]";
	}
	
	

}