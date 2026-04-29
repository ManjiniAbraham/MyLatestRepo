package aggregationExample;

public class AggregationChildClass {
	
	int id;
	String subject;
	AggregationParentClass ref;
	
	public AggregationChildClass(int id, String subject, AggregationParentClass ref) {
		
		this.id= id;
		this.subject = subject;
		this.ref= ref;
	}

	public void display() {
		
		System.out.println("This is the ID " + id + " Subject is " + subject);
		System.out.println(" Marks is " + ref.mark + " Name is " + ref.name);
	}
	
	public static void main(String[] args) {
		AggregationParentClass object1 = new AggregationParentClass(77, "Manjini");
		AggregationChildClass object = new AggregationChildClass(61, "Math", object1);
		object.display();
		

	}

}
