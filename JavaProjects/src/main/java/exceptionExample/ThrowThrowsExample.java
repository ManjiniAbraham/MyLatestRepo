package exceptionExample;

public class ThrowThrowsExample {

	public static void main(String[] args) throws Exception {
	
		int age =12;
		if(age>=18) {
			
			System.out.println("Eligible to vote");
			
		}
		else {
			
			throw new Exception ("Not eligible");
		}

	}

}
