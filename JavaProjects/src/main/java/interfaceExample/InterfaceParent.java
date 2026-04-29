package interfaceExample;

public interface InterfaceParent {

	
	public abstract void sum();
	
	public static final int c=10;
	int d = 40; // either ways , you give the entire systan or just declaring a variable with in the interface will consider it as a final variable
	
	public static void staticName() {
		
		System.out.println("this is a static method in an interface"); 
	}
	
	default void defaultName() {
		
		System.out.println(c + " and " + d);
		
	}
}
