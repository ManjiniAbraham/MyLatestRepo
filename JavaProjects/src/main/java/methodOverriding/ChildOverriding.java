package methodOverriding;

public class ChildOverriding extends ParentOverriding
{
	
	public void instanceMethod() 
	{
		super.instanceMethod();
		System.out.println("This is an instance method from child class to demo method overriding");
	}
	
	public int addition(int num1, int num2)
	{
		System.out.println("Printing parent method addition " + super.addition(10, 10));
		int sum = num1 + num2;
		return sum;
	}
	
	@Override
	public void product() 
	{
		super.product();
	}
	
	public static void main(String[] args) 
	{
		ChildOverriding object = new ChildOverriding();
		object.instanceMethod();
		System.out.println("Printing child method addition " + object.addition(5, 10));
		object.product();
	}

	
}
