
//The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more 
//than once in the original string. Ignore capitalization when determining if a character is a duplicate.

/**
 * [duplicateEncode description]
 * @param  {[type]} word [description]
 * @return {[type]}      [description]
 */

//这是错的，因为不知道其最终出现了多少次　无法这么判断
function duplicateEncode(word){
    var map = {};
    for(let i=0; i<word.length; i++){
    	if(map.hasOwnProperty(word[i])){
    		word[i] = ")";
    	}else{
    		map[word[i]] = 1;

    	}
    }

}
