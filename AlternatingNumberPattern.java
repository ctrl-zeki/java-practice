import java.util.Scanner; // Import Scanner class for user input

public class AlternatingNumberPattern {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner inp = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Input a number: ");
        int number = inp.nextInt(); // Store user input

        int start = 1; // Controls whether to print ascending or descending

        // Loop for number of rows based on user input
        for (int row = 1; row <= number; row++) {

            // If start is 1, print numbers in ascending order
            if (start == 1) {

                for (int inc = 1; inc <= number; inc++) {
                    System.out.print(inc); // Print increasing numbers
                }

                start = number; // Change value to switch direction next row
                System.out.println(); // Move to next line
            }

            // Otherwise, print numbers in descending order
            else {

                for (int dec = number; dec >= 1; dec--) {
                    System.out.print(dec); // Print decreasing numbers
                }

                start = 1; // Reset to switch direction again
                System.out.println(); // Move to next line
            }
        }

        inp.close(); // Close Scanner to prevent resource leak
    }
}