package interfaceExample;

public class ChildClassOne implements InterfaceOne, InterfaceTwo {

	public static void main(String[] args) {
		ChildClassOne childObj = new ChildClassOne();
		childObj.display1();
		childObj.display2();
		childObj.test();
		

	}

	@Override
	public void display2() {
		System.out.println("Printing from InterfaceTwo");		
	}

	@Override
	public void display1() {
		System.out.println("Printing from InterfaceOne");	
		
	}

	@Override
	public void test() {
		System.out.println("This is for a method with the same name in both interface one and two");
		
	}

}
