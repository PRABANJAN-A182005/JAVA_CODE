import java.util.Scanner;

public class armstrong {

    public static boolean check(int a) {
        int c = 0;
        int d = a;
        //using while for condition for check armstrong
        while (d!=0) {
            if (d == 0) {
                break;
            } else {
                int b = d % 10;
                c = c + (b * b * b);
                d = d / 10;
            }
        }//return true or false when the condition executed
        if (c == a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (check(a) == true) {
            System.out.println("GIVEN NUMBER IS ARMSTRONG NUMBER");
        } else {
            System.out.println("GIVEN NUMBER IS NOT ARMSTRONG NUMBER");
        }
        sc.close();
    }
}
