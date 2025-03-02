// 3.Write a program to read a four digit number through the keyboard and calculate the sum
// of its digits

import java.util.Scanner;

public class fourSum {
    public static void main(String[] args) {
        int sum = 0;
        int i=0;
        Scanner sc = new Scanner(System.in);
        do{
            i++;
            sum += sc.nextInt();
        }while(i<4);
        System.out.println(sum);
        sc.close();
    }
}
