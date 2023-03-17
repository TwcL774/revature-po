import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        // create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // initialize the number of minutes to 0
        int minutes = 0;

        // use a while loop to repeatedly ask the user for input until a valid integer is entered
        while (true) {
            System.out.print("Enter an integer number of minutes: ");

            // check if the input is a valid integer
            if (scanner.hasNextInt()) {
                // if so, store the input as the number of minutes and exit the loop
                minutes = scanner.nextInt();
                break;
            }

            // if the input is not a valid integer, clear the scanner buffer and ask the user to try again
            scanner.next();
            System.out.println("Invalid input. Please enter an integer number of minutes.");
        }

        // close the scanner object
        scanner.close();

        // call the convertMinutesToSeconds function to calculate the equivalent number of seconds
        int seconds = convertMinutesToSeconds(minutes);

        // output the result to the console
        System.out.println(minutes + " minute/s is equal to " + seconds + " seconds.");
    }
    
    // define the convertMinutesToSeconds function, which takes an integer number of minutes as input and returns the equivalent number of seconds
    public static int convertMinutesToSeconds(int minutes) {
        int result = 0;
        
        // loop through each minute
        for (int i = 0; i < minutes; i++) {
            // loop through each second in the minute
            for (int j = 0; j < 60; j++) {
                // increment the result by 1 second
                result += 1;
            }
        }
        
        // return the total number of seconds
        return result; 
    }

}
