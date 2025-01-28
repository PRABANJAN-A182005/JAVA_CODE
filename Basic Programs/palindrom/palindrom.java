import java.util.Scanner;
public class palindrom {
    //function for check palindrom
    public static void check(String a){
        int len = a.length();
        String b ="";
        // using for loop for ilteration
        for(int i=(len-1);i>=0;i--){
            b+=a.charAt(i);
        }
        // conditional statment for palindrom
        if(a.equals(b)){
            System.out.println("Given string is palindrom");
        }
        else{
            System.out.println("Given String is not a Palindrom");
        }
    }
    //main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING TO CHECK PALINDROM :- ");
        String a = sc.nextLine();
        check(a);
    }
    
}
