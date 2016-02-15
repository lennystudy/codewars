package codewars;
import java.math.*;

import org.junit.Test.None;

/**
 * 
 * @author lenny
 * input: string
 * output: your chosen primitive type
 * all inputs are valid
 * return "none" if no type fits
 *
 */
public class Primitive {

    public String determineType(String number) {
    	Long parseNumber = Long.parseLong(number);
    	try {
    		if (parseNumber >= Byte.MIN_VALUE && parseNumber <= Byte.MAX_VALUE) {
				return "byte";
			}else if (parseNumber >= Short.MIN_VALUE && parseNumber <= Short.MAX_VALUE) {
				return "short";
			}else if (parseNumber >= Integer.MIN_VALUE && parseNumber <= Integer.MAX_VALUE) {
				return "int";
			}else if(parseNumber >= Long.MIN_VALUE && parseNumber <= Long.MAX_VALUE){
				return "long";
			}
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return "none";
		}
            // determine type...
    	return "none";
    }
    
    public static void main(String[] args){
    	System.out.print(Byte.MIN_VALUE);
    	System.out.println(Byte.MAX_VALUE);
    	System.out.println(Short.MAX_VALUE);
    	System.out.println(Integer.MAX_VALUE);
    	System.out.println(Long.MAX_VALUE);
    	String string = "123456";

    	System.out.println(string.length());
    	System.out.println(string.indexOf("1"));
    	System.out.println(string.charAt(1));
    	System.out.println(string.substring(0));
    }
}