import java.util.Scanner;

public class perfectNumber {

    public static boolean checkPerfectNumber(int num){
        for(int i=2;i<num;i++){
            if((num%i)==0){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:- ");
        int num = sc.nextInt();
        System.out.println(checkPerfectNumber(num));

    }
}
