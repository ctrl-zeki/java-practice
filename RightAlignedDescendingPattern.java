import java.util.Scanner; // Import Scanner class to read user input

public class RightAlignedDescendingPattern { // Renamed class for clarity

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in); // Create Scanner object
        System.out.print("Input a number: ");  // Prompt user for input
        int number = inp.nextInt();            // Store input number

        // Loop for each line starting from input number down to 1
        for (int num = number; num >= 1; num--) {

            // Print spaces to align numbers to the right
            for (int space = 0; space < number - num; space++) {
                System.out.print(" ");
            }

            // Print the number 'num', 'num' times
            for (int reps = 0; reps < num; reps++) {
                System.out.print(num);
            }

            System.out.println(); // Move to next line after printing numbers
        }

        inp.close(); // Close Scanner to prevent resource leak
    }
}