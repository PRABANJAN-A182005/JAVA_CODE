// 10.Program to print the MSB digit of given number {Input :1567, Output: 1}

import java.util.Scanner;

public class msb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num >= 10) {
            num /= 10;
        }   
        System.out.println(num);
        sc.close();
    }
}
