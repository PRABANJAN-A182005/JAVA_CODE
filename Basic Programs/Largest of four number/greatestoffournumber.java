import java.util.Scanner;

public class greatestoffournumber {
    //condition for check larger number from 4 numbers
    public static int FindGreatest(int a, int b, int c, int d) {
        //here I check only a value
        if ((a < b) && (a < c)) {
            //here for b, c & d
            if ((b > c) && (b > d)) {
                System.out.println("B is greater number");
            } else if ((c > b) && (c > d)) {
                System.out.println("C is greater number");
            } else {
                System.out.println("D is greater number");
            }
        //here I check for a & D    
        } else if (a > d) {
            System.out.println("a is greater number");
        } else {
            System.out.println("d is greater number");
        }
        return a;
    }
    //main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        FindGreatest(a, b, c, d);//function call
    }
}
