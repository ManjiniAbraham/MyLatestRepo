package methodOverriding;

public class ParentOverriding {

	public void instanceMethod() {
		
		System.out.println("This is an instance method from parent class to demo method overriding");
	}
	
	public int addition(int num1, int num2) {
		
		int sum = num1 + num2;
		return sum;
				
	}
	
	public void product() {
		
		int num1 =2;
		int num2 = 3;
		float prod = num1*num2;
		System.out.println("Product is " + prod);
	}
}
