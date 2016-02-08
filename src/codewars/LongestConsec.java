package codewars;

import java.util.Arrays;

/**
 * You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * lenny
 *
 */
public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        // your code
    	String answer = "";
    	if(strarr.length==0 || k<=0 || k>strarr.length){
    		return answer;
    	}
    	int[] strarrLength = new int[strarr.length];
    	for(int i=0;i<strarr.length;i++){
    		strarrLength[i] = strarr[i].length();
    	}
    	//notice that k still may return the wrong answer,k strings may cross the border
    	//but the problem is that program looks not beautiful
    	//so this method is wrong
    	Arrays.sort(strarrLength);
    	if(strarrLength[strarr.length]+k-1 > strarr.length ){
    		return answer;
    	}
    	StringBuffer stringBuffer = new StringBuffer();
    	for(int i=0;i<k;i++){
    		stringBuffer.append();
    	}
    	return answer;
    }
}
