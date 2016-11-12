// If we list all the natural numbers below 10 that are multiples of 3 or 5,
//  we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
// Note: If the number is a multiple of both 3 and 5, only count it once.

/**
 * [solution description]
 * @param  {[type]} number [description]
 * @return {[type]}        [description]
 */
function solution(number){
  var count_3 = Math.floor(number/3);
  var count_5 = Math.floor(number/5);
  if (count_3 == 0){
  	return 0;
  }
  if (count_5 == 0) {
  	return 3;
  }
  var sum = 0;







}


/**
 * 最简单的全部遍历
 * @param  {[type]} number [description]
 * @return {[type]}        [description]
 */
function solution(number){
	var sum = 0;
	for(var i=3; i<number; i++){
		if( i%3==0 || i%5 == 0){
			sum = sum + i;
		}
	}
	return sum;

}