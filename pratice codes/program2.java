import java.util.Scanner;

public class program2 {
    public static int findNthNumberInSeries(int a, int b, int c, int N) {
        int[] differences = { b - a, c - b };
        int curr = c;
        int i = 3;

        while (i < N) {
            curr += differences[(i - 3) % 2];
            i++;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        int b = sc.nextInt();
        int c = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(findNthNumberInSeries(a, b, c, N));
        sc.close();
    }

}
