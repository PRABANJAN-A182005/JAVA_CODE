import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        // Loop over each test case
        for (int i = 0; i < t; i++) {
            try {
                // Read the number (it can be arbitrarily large)
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");

                // Check if the number can fit in each primitive data type, in order
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                if (n >= -2147483648L && n <= 2147483647L) {
                    System.out.println("* int");
                }
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Handle the case where the input is invalid or too large to fit in any primitive
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
