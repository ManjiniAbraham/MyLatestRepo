package superKeyword;

public class ChildSuperMethod extends ParentSuperMethod{
	
	public void childDisplay() {
		super.display();	
		System.out.println("Sum from parent class " + super.addition(6,  8));
		System.out.println("This is to display the child class super method");
		System.out.println("This is using this coz of te current class " + this.childDisplay2(10, 10));
	}
	
	public int childDisplay2(int num1, int num2) {
		super.parentDisplay2();
		int totalInChild = num1 + num2;
		return totalInChild; //return should always be the last statement in a method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSuperMethod object = new ChildSuperMethod();
		object.childDisplay();
		//object.display();
	

	}

}
