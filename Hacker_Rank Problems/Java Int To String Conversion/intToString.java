import java.util.*;

public class intToString {
    public static void main(String[] args) {

        // Removed the code to forbid exit since it's deprecated

        try {
            Scanner in = new Scanner(System.in);

            // Read an integer input
            int n = in.nextInt();
            in.close();

            // Convert the integer to a string
            String s = String.valueOf(n);

            // Check if the string converted back to integer equals the original integer
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }

        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
