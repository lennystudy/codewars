package codewars;

public class LongestConsec1 {
	/**
	 * 重新理解了题目,求字符串中最长的连续k个子字符串
	 * @param strarr
	 * @param k
	 * @return
	 */
	 public static String longestConsec(String[] strarr, int k) {
		 String answer = "";
	    	if(strarr.length==0 || k<=0 || k>strarr.length){
	    		return answer;
	    	}
		 int stringLength = 0;
		 int maxStringLength = 0;
		 StringBuffer stringBuffer = new StringBuffer();
		 for(int i=0;i<=strarr.length-k;i++){
			for(int j=i;j<i+k;j++){
				stringLength += strarr[j].length();
			}
			if(maxStringLength < stringLength){
				stringBuffer.setLength(0);
				maxStringLength = stringLength;
				for(int j=i;j<i+k;j++){
					stringBuffer.append(strarr[j]);
				}
			}
			stringLength = 0;
		 }
		 answer = stringBuffer.toString();
		 return answer;
	 }
	 
	 
	    public static void main(String[] args){
	    	System.out.println("LongestConsec.main()");
	    	String[] strarr = new String[]{"hello","lenny","ivwswynn","ivwsasdfg"};
	    	String[] strarr1 = new String[]{"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"};
 	    	System.out.println(LongestConsec1.longestConsec(strarr, 2));
 	    	System.out.println(LongestConsec1.longestConsec(strarr1, 2));
	    }
	    
}
