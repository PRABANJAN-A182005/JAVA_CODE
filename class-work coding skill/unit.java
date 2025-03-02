// 9.Program to print the unit digit of a given number Input: 1567, Output: 7

import java.util.Scanner;

public class unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("unit digit:- "+num%10);
        sc.close();
    }
}
