// 6. Collect three run time input from user Add together the first two numbers and then multiply
// this total by the third Display the answer as “The answer is :“[Answer]

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d = (a+b)*c;
        System.out.println("the answer is:- "+d);
        sc.close();
    }
}
