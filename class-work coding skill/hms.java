// 8.Program to calculate hours, minutes and seconds for a given input days

import java.util.Scanner;

public class hms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter days:- ");
        int days = sc.nextInt();
        System.out.println("hours:- "+days*24+"\nminutes:- "+(days*24)*60+"\nseconds:- "+((days*24)*60)*60);
        sc.close();
    }
}
