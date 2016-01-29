package herdingcats;

public class NumberFun {
	  public static long findNextSquare(long sq) {
	      //目前思路~利用二分法查询其是否完全平方数
		  long begin = 0;
		  long end = sq;
		  long mid = (begin+end)/2;
		  while(begin < end){
			  if(mid*mid == sq){
				  return (mid+1)*(mid+1);
			  }else if(mid*mid > sq) {
				end = mid;
			}else {
				begin = mid;
			}
		  }
	      return -1; 
	  }
	}
