import java.util.Scanner;

public class fizzbuzz {
    public static void operator(int a) {
        String[] arrs = new String[a];
        // Loop should start from 0 to (a-1).
        for (int i = 0; i < a; i++) {
            // Since array is 0-based, using i+1 here.
            int num = i + 1;
            if (num % 3 == 0) {
                arrs[i] = "FIZZ";
            } else if (num % 5 == 0) {
                arrs[i] = "BUZZ";
            } else {
                arrs[i] = String.valueOf(num);
            }
        }
        for (String arr : arrs) {
            System.out.print(arr+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        operator(a);
        sc.close();

    }
}
