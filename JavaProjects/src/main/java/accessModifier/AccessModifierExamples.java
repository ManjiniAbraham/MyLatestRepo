package accessModifier;

public class AccessModifierExamples {
	//creating a public instance method
	
	public void publicInstanceMethod() 
	{
		
		System.out.println("This is a public instance method ");
	}

	//creating a private instance method
	
	private void privateInstanceMethod()
	{
			
		System.out.println("This is a private instance method ");
	}
		
	//creating a protected instance method
		
	protected void protectedInstanceMethod() 
	{
				
		System.out.println("This is a protected instance method ");
	}
			
	//creating a default instance method
			
	void defaultInstanceMethod() 
	{
			
	System.out.println("This is a default instance method ");
	
	}	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExamples object = new AccessModifierExamples();
		object.publicInstanceMethod();
		object.privateInstanceMethod();
		object.protectedInstanceMethod();
		object.defaultInstanceMethod();

	}
	
	
}


