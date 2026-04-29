package superKeyword;

public class ChildSuperConstructor extends ParentSuperConstructor{
	
	public ChildSuperConstructor()
	{
		super();// this should always be the first statement. always points to the parent class non-parameterized constructor. 
		System.out.println("This is a non parameterized constructor from the child class");
	}
	public ChildSuperConstructor(int b)
	{
		super(10);
		System.out.println("B is " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSuperConstructor object = new ChildSuperConstructor();
		//ParentSuperConstructor parent = new ParentSuperConstructor();
		ChildSuperConstructor object1 = new ChildSuperConstructor(5);

	}

}
