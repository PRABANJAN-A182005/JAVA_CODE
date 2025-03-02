// 7.Program to print only the added fraction of any two number {Input: 2.356, 3.5678 Output:0.9238}

import java.util.Scanner;

public class addfrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a+b;
        System.out.println(sum-(int)sum);
        sc.close();
    }
}
