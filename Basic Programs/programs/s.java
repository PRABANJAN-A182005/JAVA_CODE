import java.util.Scanner;
//function for recursion
public class s{
    public static int factorial(int num) {
        //condition for recursion
        if (num == 1 || num == 0) {
            return num = 1;
        } else {
            //main logic ---> here the factorial function is called again and again {factorial(num - 1);} to get the value of "num" factorial
            return num * factorial(num - 1);
        }
    }
//main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :- ");
        int num = sc.nextInt();
        int d=num;
        int ans=0;
        while (d!=0) {
            if (d == 0) {
                break;
            } else {
                int b = d % 10;
                ans= ans+factorial(b);
                d = d / 10;
            }
        }
        if (ans==num){
            System.out.println(ans+" IS STRONG NUMBER");
        }
        else{
            System.out.println(ans+" IS NOT STRONG NUMBER");
        }
        sc.close();
    }
}

 
