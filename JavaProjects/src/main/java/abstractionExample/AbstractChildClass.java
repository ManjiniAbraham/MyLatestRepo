package abstractionExample;

public class AbstractChildClass extends AbrstactParentClass{
	@Override
	public void addition() {
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("Sum is " + sum);
		
	}
	@Override
	public double product(int num3, int num4) {
			double prod = num4* num3;
			
		return prod;
	}


	public static void main(String[] args) {
		AbstractChildClass childObj = new AbstractChildClass();
		childObj.addition();
		System.out.println("Product is " + childObj.product(5, 5));
		childObj.nameDisplay();
		//AbrstactParentClass parentObj = new AbrstactParentClass(); -cannot create an object for an abstract class instead w should create using reference of the childclassname . 
		System.out.println("==============Using reference to childclass=====================");
		AbrstactParentClass parentObj = new AbstractChildClass();
		parentObj.addition();
		parentObj.nameDisplay();
		System.out.println("Product is " + parentObj.product(5, 5));

	}




}
