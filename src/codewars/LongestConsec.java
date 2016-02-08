package codewars;

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
    	int longStringLength = 0;
    	int maxIndex = 0;
    	for(int i=0;i<strarr.length;i++){
    		if(longStringLength < strarr[i].length()){
    			maxIndex = i;
    			longStringLength = strarr[i].length();
    		}
    	}
    	//notice that k still may return the wrong answer,k strings may cross the border
    	//but the problem is that program looks not beautiful
    	//so this method is wrong
    	
    	if(maxIndex+k-1 > strarr.length ){
    		return answer;
    	}
    	StringBuffer stringBuffer = new StringBuffer();
    	for(int i=0;i<k;i++){
    		stringBuffer.append(strarr[maxIndex++]);
    	}
    	answer = stringBuffer.toString();
    	return answer;
    }
    
    public static void main(String[] args){
    	System.out.println("LongestConsec.main()");
    	String[] strarr = new String[]{"hello","lenny","ivwswynn"};
    	System.out.println(LongestConsec.longestConsec(strarr, 1));
    }
    
    
}
