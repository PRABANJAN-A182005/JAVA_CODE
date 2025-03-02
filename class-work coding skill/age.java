// 5.Write a program to calculate age based on input of date, month and year

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the birth Date :- ");
        int date = sc.nextInt();
        System.out.print("Enter the birth month :- ");
        int month = sc.nextInt();
        System.out.print("Enter the birth year :- ");
        int year = sc.nextInt();
        int currentd = 3;
        int currentm = 3;
        int currenty = 2025;
        int age = year - currenty;
        if(age<0){
            age*=(-1);
        }
        if(date>currentd || month>currentm){
            System.out.println(age-1);
        }
        else{
            System.out.println(age);
        }
        sc.close();
    }
}
