// 1. Check if a Character is a Vowel or Consonant:
//    Given a character, determine if it is a vowel (a, e, i, o, u) or a consonant using conditional statements.
import java.util.Scanner;

public class program1 {

    public static String check(Character input) {

        Character[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < vowels.length; i++) {
            if (input.equals(vowels[i])) {
                return "it's vowels";
            }
        }
        return "it's consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character:- ");
        Character input = sc.nextLine().charAt(0);
        System.out.println(check(input));
        sc.close();
    }
}