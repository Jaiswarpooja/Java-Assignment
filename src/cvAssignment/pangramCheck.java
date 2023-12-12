package cvAssignment;

import java.util.Scanner;

public class pangramCheck {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for simplicity

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean checkPangram(String input) {
        // Assuming ASCII values for lowercase letters ('a' to 'z') are consecutive
        int[] alphabetCount = new int[26];

        // Count the occurrences of each lowercase letter in the input
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar >= 'a' && currentChar <= 'z') {
                alphabetCount[currentChar - 'a']++;
            }
        }

        // Check if each letter occurred at least once
        for (int count : alphabetCount) {
            if (count == 0) {
                return false;
            }
        }

        return true;
    }
}
