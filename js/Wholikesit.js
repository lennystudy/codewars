// You probably know the "like" system from Facebook and other pages. People can "like" blog posts, 
// pictures or other items. We want to create the text that should be displayed next to such an item.
// Implement a function likes :: [String] -> String, which must take in input array, 
// containing the names of people who like an item. It must return the display text as shown in the examples:
// For more than 4 names, the number in and 2 others simply increases.
function likes(names) {
    if (names.length == 0) {
    	return "no one likes this";
    }else if(names.length == 1){
    	return names[0] + " likes this";
    }
    else if(names.length ==2 ){
    	// var str ;
    	// for (let i in names){
    	// 	if(i == 0){
    	// 		str = names[i];
    	// 		continue;
    	// 	}
    	// 	str += " and " + names[i];
    	// }
    	// return str + " like this";
    	return names[0] + " , " + names[1] + " like this";
    }else if (names.length == 3) {
    	return names[0] + " , " + names[1] + " and "+ names[2] + " like this"; 
    }else{
    	return names[0] + names[1] + " and "+ (names.length - 2)+" others like this";
    }

}


function likes(names) {
    if (names.length == 0) {
    	return "no one likes this";
    }else if(names.length == 1){
    	return names[0] + " likes this";
    }
    else if(names.length ==2 ){
    	return names[0] + " and " + names[1] + " like this";
    }else if (names.length == 3) {
    	return names[0] + ", " + names[1] + " and "+ names[2] + " like this"; 
    }else{
    	return names[0] +", " +names[1] +" and "+ (names.length - 2)+" others like this";
    }

}
