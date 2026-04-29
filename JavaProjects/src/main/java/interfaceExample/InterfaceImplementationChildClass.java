package interfaceExample;

public class InterfaceImplementationChildClass implements InterfaceParent{


	@Override
	public void sum() {
		int a = 2;
		int b = 6;
		int total = a+b;
		System.out.println("printing for interface from parent interface");
		System.out.println("Sum is: " + total);
		
	}
	

	public static void main(String[] args) {
		//using interface reference
		InterfaceParent interfaceObj = new InterfaceImplementationChildClass();
		
		//using childclass object creation
		InterfaceImplementationChildClass childObj = new InterfaceImplementationChildClass();
		
		interfaceObj.sum();
		interfaceObj.defaultName();
		InterfaceParent.staticName(); // classname.methodname is how you call a static method
		
		
	}

}
