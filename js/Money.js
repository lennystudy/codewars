
/**
 * Mr. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years 'Y' this sum has to be kept in the bank 
 * in order for this sum of money to amount to 'D'.
The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly, and the new sum is re-invested yearly after paying tax 'T'
Note that the principal is not taxed but only the year's accrued interest
 */

/**
 * [calculateYears description]
 * @param  {[type]} principal [description]
 * @param  {[type]} interest  [description]
 * @param  {[type]} tax       [description]
 * @param  {[type]} desired   [description]
 * @return {[type]}           [description]
 */
function calculateYears(principal, interest, tax, desired) {
    var year = 0;
    while(principal < desired){
    	year++;
    	principal = principal + (principal * interest) * (1 - tax);
    }

    return year;
}