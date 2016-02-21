package codewars;

/**
 * 
 * @author lenny
 * For the purposes of this kata, here is what makes a valid email:
 * At least one letter character at the beginning
 * All characters between the first character and the @ (if any) must be letters, numbers, or underscores
 * There must be an @ character (after the points listed just now)
 * After the @ character, there must be at least one word character (letter, number, or underscore) or hyphen
 * The email must end with at least one set of a dot followed by one or more word characters.
 * The input must NOT be case-sensitive
 *
 */
public class EmailValidator{
	public static boolean validate(String input){
		// return a boolean
		return input.matches("[0-9a-zA-Z/_]+@[0-9a-zA-Z/_/.]");
	}
	
	//´ð°¸Ö®Ò»
	  public static boolean validate1(String input) {
		    return input.matches("^[a-zA-Z]\\w*@[\\w-]+(\\.\\w+)+$");
		  }
	
	public static void main(String[] args){
		String string = "134";
		System.out.println(string.matches("1[2-5]4"));
		System.out.println(string.matches("1.4"));
		System.out.println(string.matches("1(2|23)4"));
		
		System.out.println(string.matches("[0-9]+"));
	}
}