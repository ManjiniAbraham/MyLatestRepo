package inheritance;

public class ChildMakeAndModel extends IntermediateVehicleBrand {
	public void makeAndModel() {
		System.out.println("I have a C and G class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMakeAndModel object=new ChildMakeAndModel(); 
		object.vehicle();
		object.brand();
		object.makeAndModel();
	}
	}


