package herdingcats;

public class NumberFun {
	  public static long findNextSquare(long sq) {
	      //Ŀǰ˼·~���ö��ַ���ѯ���Ƿ���ȫƽ����
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
