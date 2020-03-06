import java.util.Arrays;
import java.util.Random;
/**
* This program displays the max and min value of random numbers.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-03-03
*/

public class MaxMin {
  /**
  * This method displays the max and min value of random numbers.
  */
  public static void main(String[] args) {
  
    // variables
    Random rand = new Random();
    int[] randNums = new int[10];
    int max;
    int min;

    // generating random numbers 1-99
    for (int i = 0; i < randNums.length; i++) {
      randNums[i] = rand.nextInt(99) + 1;
      System.out.print(randNums[i] + "\n");
    }

    // call method
    max = findMax(randNums);
    min = findMin(randNums);

    // output
    System.out.print("\nThe max is " + max + " and the min is " + min + ".");
  }

  /**
  * This method finds the max value of the array.
  */
  public static int findMax(int [] randNums) {

    // variables
    int max = randNums[0];

    // process
    for (int i = 1; i < randNums.length; i++) {
      if (max < randNums [i]) {
        max = randNums [i];
      }
    }

    return max;
  }

  /**
  * This method finds the min value of the array.
  */
  public static int findMin(int [] randNums) {

    // variables
    int min = randNums[0];
    
    // process
    for (int i = 1; i < randNums.length; i++) {
      if (min > randNums [i]) {
        min = randNums [i];
      }
    }
    return min;
  }
}