import java.util.Scanner;

public class addAnddiv {
    // function for add two number
    public static int add(int a, int b) {
        int c = a + b;
        System.out.println("\nA + B = " + c);
        return check(c);
    }

    // function for check the added number is divisable by 2
    public static int check(int c) {
        if (c % 2 == 0) {
            System.out.println(c + " is (a+b) divisable by 2");
        } else {
            System.out.println(c + " is (a+b) not divisable by 2");
        }
        return 0;
    }

    // main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER VALUE OF A:- ");
        int a = sc.nextInt();
        System.out.print("ENTER VALUE OF B:- ");
        int b = sc.nextInt();
        add(a, b);
    }
}
