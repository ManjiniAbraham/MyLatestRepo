package superKeyword;

public class ChildSuperVariable extends ParentSuperVariable {
	
	String colour= "Red";
	
	public void parentClassDisplay() {
		
		System.out.println("Parent class colour is " + super.colour);
		System.out.println(colour); //here its looking for the instance variable within this class
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildSuperVariable object = new ChildSuperVariable();
		System.out.println("Child class Colour is " + object.colour);
		object.parentClassDisplay();

	}

}
