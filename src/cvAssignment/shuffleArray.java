package cvAssignment;

import java.util.Random;

//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

public class shuffleArray {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 5, 6, 7};

	        // Shuffle the array
	        shuffleArray(array);

	        // Print the shuffled array
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	    }

	    // Fisher-Yates shuffle algorithm
	    private static void shuffleArray(int[] array) {
	        Random random = new Random();

	        for (int i = array.length - 1; i > 0; i--) {
	            // Generate a random index between 0 and i (inclusive)
	            int randomIndex = random.nextInt(i + 1);

	            // Swap array[i] with array[randomIndex]
	            int temp = array[i];
	            array[i] = array[randomIndex];
	            array[randomIndex] = temp;
	        }
	    }
}
