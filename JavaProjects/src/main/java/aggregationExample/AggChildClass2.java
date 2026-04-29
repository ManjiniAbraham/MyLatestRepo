package aggregationExample;

public class AggChildClass2 {
	int num3;
	int num4;
	int prod;
	AggParentclass2 ref;
	
	public AggChildClass2(int num3, int num4, AggParentclass2 ref) 
	
	{
		this.num3=num3;
		this.num4= num4;
		this.prod = prod;
		this.ref=ref;
		
		prod = num3 * num4;
	}
public void display() {
		
		System.out.println("Sum is "+ ref.sum);
		System.out.println("Product is " + prod);
	}

	public static void main(String[] args) {
		AggParentclass2 parentobj = new AggParentclass2(5, 5);
		AggChildClass2 childobj = new AggChildClass2(6,10, parentobj);
		childobj.display();

	}

}
