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
	/**
	 * 确实是从最大的长整型开始判断
	 * 还需要特别注意临界的条件
	 * @param number
	 * @return
	 */
    public String determineType(String number) {

    	try {
    		long parseNumber = Long.parseLong(number);
    		if (parseNumber > Integer.MAX_VALUE || parseNumber < Integer.MIN_VALUE) {
				return "long";
			}else if (parseNumber > Short.MAX_VALUE || parseNumber < Short.MIN_VALUE) {
				return "int";
			}else if (parseNumber > Byte.MAX_VALUE || parseNumber < Byte.MIN_VALUE) {
				return "short";
			}else {
				return "byte";
			}
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return "none";
		}
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