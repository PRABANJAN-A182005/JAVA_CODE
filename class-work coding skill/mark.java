// 2.Write a program to read the marks of 5 subjects through the keyboard Find out the
// aggregate and percentage of marks obtained by the student Assume maximum marks
// that can be obtained by a student in each subject as 100

import java.util.Scanner;

public class mark {
    public static int percentageMark(int TotalMark) {
        return TotalMark / 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject_name = { "English", "Tamil", "Maths", "Science", "Social Science" };
        int TotalMark = 0;
        for (int i = 0; i < subject_name.length; i++) {
            System.out.print("Mark Of "+ subject_name[i] + " :- ");
            int mark = sc.nextInt();
            System.out.println(subject_name[i] + " :- " + mark);
            TotalMark += mark;
        }
        System.out.println("Total Mark :- " + TotalMark);
        System.out.println("Total Percentage :- " + percentageMark(TotalMark));
        sc.close();
    }
}
