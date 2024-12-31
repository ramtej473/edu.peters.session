package edu.peters.session;
interface Bank{
	
	void withDraw(int amt) throws InSufficientBalanceException;
}


public class Demo6 {

	public static void main(String[] args) throws Exception {
		System.out.println("hello1");
		System.out.println("hello2");
		
		boolean c = 1==1;
		boolean b = c;
		if(b) throw new Exception("Peter college Exception");
				
		System.out.println("hello3");
		System.out.println("hello4");
		System.out.println("hello5");

	}

	public static void main1(String[] args) throws Exception {
	
		// throw   throws
		
		m1();

	}

	private static void m1() {
		
	}

}
