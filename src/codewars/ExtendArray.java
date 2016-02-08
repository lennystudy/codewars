package codewars;
/**
 * Hello Warrior! Today, you are going to find a way to make an Array of numbers expand as needed! 
 * As you may know, one of the many functions of an ArrayList is that it can expand dynamically! 
 * For this Kata, create an Array, then find a way to expand it. 
 * Make sure you preserve any stored values during the expansion. You should not use an actual ArrayList.
 * @author lenny
 *
 */
public class ExtendArray {
    public static int[] fixSize(int[] myArray){
    	//you means that it should expand the array
    	int[] newArray = new int[myArray.length*2];
    	System.arraycopy(myArray, 0, newArray, 0, myArray.length);
        return newArray;
      }
      
      public static int getLength(int[] myArray){
        return myArray.length;
      }

      public static int get(int[] myArray, int i){
        return myArray[i];
      }
}
