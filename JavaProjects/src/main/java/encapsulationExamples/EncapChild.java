package encapsulationExamples;

public class EncapChild {

	public static void main(String[] args) {
		EncapParent parentObj =new EncapParent();
		//EncapChild childobj = new EncapChild();
		parentObj.setRollNum(48);		
		System.out.println("Roll Number is : " + parentObj.getRollNum());
		
		parentObj.setName("Manjini");
		System.out.println("Name is: " + parentObj.getName());
		
		parentObj.setMarks(89);		
		System.out.println("Marks is : " + parentObj.getMarks());
	}

}
