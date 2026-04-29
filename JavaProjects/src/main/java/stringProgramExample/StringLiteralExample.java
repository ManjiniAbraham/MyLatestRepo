package stringProgramExample;

//program to show the difference between string literal and new keyword 

public class StringLiteralExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String literal = "String Literal";
		String newKeyword = new String(" Using new keyword");
		String empty = "";
		System.out.println(literal);
		System.out.println(newKeyword);
		
		//length() - this method is used to determine the length/size of the string
		System.out.println(literal.length());
		
		//charAt() - this method is used to return the character of the string
		System.out.println(literal.charAt(5));
		System.out.println(literal.charAt(9));
		
		//concat() - used to combine two strings
		System.out.println(literal.concat(newKeyword));
		
		//contains() - to check if a character/word is present in the string
		System.out.println(literal.contains("new"));
		System.out.println(literal.contains("l"));
		System.out.println(newKeyword.contains("new"));
		
		//toUpperCase() - to convert lower case letters to upper case
		System.out.println(literal.toUpperCase());
		
		//toLowerCase() - to convert upper case letters to lower case
		System.out.println(literal.toLowerCase());
		
		//isEmpty() - to check if a string is empty or not
		System.out.println(literal.isEmpty());
		System.out.println(empty.isEmpty());
		
		
	}

}
