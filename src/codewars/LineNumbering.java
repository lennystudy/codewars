package codewars;

import java.util.*;
/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 *	Write a function which takes a list of strings and returns each line prepended by the correct number.
 * @author lenny
 *
 */
class LineNumbering {

    static List<String> number(List<String> lines) {
        // TODO
    	List<String> answer = new ArrayList<>();
    	int count = 1;
    	for (String string : lines) {
			answer.add((count++)+":"+string);
		}
    	return answer;
    }
    
    public static void main(String[] args){
    	List<String> lines = new ArrayList<>();
    	lines.add("a");
    	lines.add("b");
    	System.out.println(LineNumbering.number(lines));
    	List<String> lines2 = Arrays.asList("a", "b", "c");
    	System.out.println(LineNumbering.number(lines2));
    }

}
