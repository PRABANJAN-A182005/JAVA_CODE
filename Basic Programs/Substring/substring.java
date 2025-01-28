import java.util.Scanner;

public class substring {

    //function for do substring
    //operation ex:-
    // input = "HOW"
    // output = "H"
    //          "HO"
    //          "HOW"
    //          "O"
    //          "OW"
    //          "W"

    public void operate(String text) {
        int len = text.length();
        // condition for two pointer variable
        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len; j++) {
                System.out.println(text.substring(i, j));
            }
        }
    }

    // main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        substring obj = new substring();
        obj.operate(text);
    }

}
