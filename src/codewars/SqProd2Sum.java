package codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lenny
 *
 */
public class SqProd2Sum {
    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        // your code
    	List<long[]> answer = new ArrayList<>();
    	
    	long sum = (a*a+b*b)*(c*c+d*d);
    	for(long i=1;i<=Math.sqrt(sum);i++){
    		if(Math.sqrt(sum-i*i) == (long)Math.sqrt(sum-i*i)){
    			long[] answerArry = new long[]{i,(long) Math.sqrt(sum-i*i)};
    			answer.add(answerArry);
    		}
    	}
    	return answer;
    }
    
    public static void main(String[] args){
    	System.out.println(SqProd2Sum.prod2Sum(1, 2, 1, 3));
    	List<Long> list = new ArrayList<>();
    	list.add(2l);
    	System.out.println(list);
    	List<long[]> list2 = new ArrayList<>();
    	System.out.println(list2);
    	long[] array = new long[]{1,2};
    	list2.add(array);
    	System.out.println(list2);
    	
    }
}
