import java.util.Scanner;

public class NegativeToPositive {
//condition for print -ve term into +ve term
    public static int check(int a, int b) {
        int c = a - b;
        if ((a - b) < 0) {
            System.out.println("SUBTRACTION (-ve to +ve):- " + (c * -1));
        } else {
            System.out.println("SUBTRACTION (+ve):- " + c);
        }
        System.out.println("ADDITION :- " + (a + b));
        return 0;
    }
//main class
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        check(a, b);
    }
}