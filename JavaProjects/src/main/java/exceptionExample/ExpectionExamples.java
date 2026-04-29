package exceptionExample;

public class ExpectionExamples {

	public static void main(String[] args) {
		try {
		int num1 = 50;
		int num2 =0;
		int div = num1/num2;
		System.out.println(div); 
		}
		catch(ArithmeticException ae){
			
			System.out.println("Arithmetic Exception handled");
			
		}
		finally {
			System.out.println("Important ciode will be handled");
			System.out.println("Hello");
		}
		
			
	try
	{
		int arr[] = {1, 2, 3, 4, 5};
	
		System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException ae) 
	{
		System.out.println("  Exception handled");
		// instead of giving the type of exception we can always give the parent class "Exception"
	}
		
	/*	String a =null;
		System.out.println(a.length()); */
		
		

	}

}
