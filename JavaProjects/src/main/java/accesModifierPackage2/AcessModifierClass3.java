package accesModifierPackage2;

import accessModifier.AccessModifierExamples;

public class AcessModifierClass3 extends AccessModifierExamples{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcessModifierClass3 object1 = new AcessModifierClass3();
		object1.protectedInstanceMethod(); //Outside a package, we have to call a protected class with the child class object alone
		object1.publicInstanceMethod();
		//object.privateInstanceMethod();
		//object.defaultInstanceMethod();
		
		AccessModifierExamples object = new AccessModifierExamples();
		object.publicInstanceMethod();

	}

}
