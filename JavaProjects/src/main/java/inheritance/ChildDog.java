package inheritance;

//single inheritance example

public class ChildDog extends ParentAnimal {
	public void barking() {
		
		System.out.println("Dogs love barking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDog object=new ChildDog(); 
		object.barking(); 
		object.eating();
	}

}
