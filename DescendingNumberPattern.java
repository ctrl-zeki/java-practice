import java.util.Scanner; // Import Scanner class to read user input

public class DescendingNumberPattern { // Renamed class for clarity

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in); // Create Scanner object
        System.out.print("Input a number: ");  // Prompt user for input
        int number = inp.nextInt();            // Store input number
        int num = number;                      // Initialize variable for current number to print

        // Loop for each line, starting from input number down to 1
        for (int line = num; line > 0; line--) {

            // Loop to print the current number on this line
            for (int reps = num; reps <= number; reps++) {
                System.out.print(num); // Print the current number
            }

            System.out.println(); // Move to next line after printing numbers
            num--;                // Decrease the number for next line
        }

        inp.close(); // Close Scanner to prevent resource leak
    }
}