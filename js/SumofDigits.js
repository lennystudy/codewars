
/**
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, 
 * continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
 */

/**
 * [digital_root description]
 * @param  {[type]} n [description]
 * @return {[type]}   [description]
 */
function digital_root(n) {
  // ...
  if (n < 10) {
  	return n;
  }

  var ans = 0;
  let temp = 0;
  while(n > 10){
  	temp = n%10;
  	n = Math.floor(n/10);
  	ans = ans + temp;
  }

  ans = n + ans ;

  if(ans >= 10){
  	return digital(ans);
  }

  return ans;


}


/**
 * 这种解法应该是背后的数学原理了
 * @param  {[type]} n [description]
 * @return {[type]}   [description]
 */
function digital_root(n) {
  return (n - 1) % 9 + 1;
}