package codewars;
/**
 * 
 * @author lenny
 * Rules:
 *If the argument is null, the method should return null/nil/None according to the given language (null for JS, None for Python and so on)
 *If the argument is an empty array, the method should return null/nil/None, as stated above
 *If the argument is a valide array of strings, the method should return a hello message for every array entry
 *
 */
public class GreetingsMyFriends {
	public String[] greetingForAllFriends(String... friends) {
		// TODO Write your code below this comment
		if(friends == null || friends.length == 0){
			return null;
		}
		String[] greeting = new String[friends.length];
		for(int i=0;i<friends.length;i++){
			greeting[i] = "Hello,	"+friends[i]+"!";
		}
		return greeting;
  }
	
	public static void main(String[] args){
		GreetingsMyFriends greetingsMyFriends = new GreetingsMyFriends();
		System.out.println(greetingsMyFriends.greetingForAllFriends("Bilal"));
	}
	
}

