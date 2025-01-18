import java.util.*;
import java.io.*;

class Datatype {
    public static void main(String[] argh) {

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();

        // Iterate through each test case
        for (int i = 0; i < t; i++) {

            try {
                // Read the long value input
                long x = sc.nextLong();
                
                // Print that the number can be fitted in different data types
                System.out.println(x + " can be fitted in:");
                
                // Condition for byte: Check if the value fits in a byte (-128 to 127)
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }

                // Condition for short: Check if the value fits in a short (-32,768 to 32,767)
                if (x >= -32000 && x <= 32000) {
                    System.out.println("* short");
                }

                // Condition for int: Check if the value fits in an int (-2,000,000,000 to 2,000,000,000)
                if (x >= -2000000000 && x <= 2000000000) {
                    System.out.println("* int");
                }

                // Condition for long: Check if the value fits in a long (-9223372036854775808 to 9223372036854775807)
                if (x >= -9223372036854775807L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                // If an exception occurs (e.g., the input is not a valid number), print this message
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
