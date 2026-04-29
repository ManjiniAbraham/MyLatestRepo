package accessModifier;

public class AccessModifierClass2 extends AccessModifierExamples{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifierClass2 object = new AccessModifierClass2();
		object.publicInstanceMethod();
		object.defaultInstanceMethod();
		object.protectedInstanceMethod();
		//object.privateInstanceMethod(); // this method is private and cannot be accessed outside the class.
	}

}
