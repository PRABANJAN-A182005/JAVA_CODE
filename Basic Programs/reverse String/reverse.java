import java.util.Scanner;

public class reverse {
//function used for reverse the string
    public static String Reverse(String text) {
        int len = text.length();
        String retext = "";
        //condition and loop for ilterate the char in string from last index to first index
        for (int i = len - 1; i >= 0; i--) {
            retext += text.charAt(i);
        }
        return retext;
    }

    //main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE STRING:- ");
        String text = sc.nextLine();
        System.out.println(Reverse(text));

    }
}
