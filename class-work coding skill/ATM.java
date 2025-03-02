// 4.An ATM contains Indian currency notes of 100 500 and 1000 To withdraw cash from this
// ATM, the user has to enter the number of notes he/she wants of each currency, i.e., of 100
// 500 and 1000 Write a program to calculate the total amount withdrawn by the person
// from the ATM in rupees

import java.util.Scanner;

public class ATM {
    public static int totalAmount(int h, int fh, int th) {
        return (h * 100) + (fh * 500) + (th * 1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of hundred:- ");
        int h = sc.nextInt();
        System.out.print("enter no of five hundred:- ");
        int fh = sc.nextInt();
        System.out.print("enter no of thousand:- ");
        int th = sc.nextInt();
        System.out.println("total amount to withdraw :- " + totalAmount(h, fh, th));
        sc.close();
    }
}
