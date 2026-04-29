package finalKeyword;

public class FinalKeywordExample {
	
	public final void checkingFinalMethod() {
		
		System.out.println("This is to check for overriding on a final method ");
	}
	
	
	public static void main(String[] args) {
	
		//checking for final variable		
		final int num1 = 10;
		//num1 =12; ---- this will throw an error to remove the final access specifier.
		System.out.println(num1);


	}

}
