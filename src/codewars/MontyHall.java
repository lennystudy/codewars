package codewars;
/**
 * In this program you are given an array of people who have all guessed on a door from 1-3,
 *  as well as given the door which includes the price. You need to make every person switch 
 *  to the other door, and increase their chances of winning. Return the winpercentage (in int,
 *   rounded) of all participants.
 * @author lenny
 *
 */
public class MontyHall {

	public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
		int winner = 0;
		int winpercentage = 0;
		for(int i=0;i<participantGuesses.length;i++){
			if(correctDoorNumber != participantGuesses[i])
				winner++;
		}
		winpercentage = (int)((float)winner/participantGuesses.length*100);
		return winpercentage;
	
	}

}