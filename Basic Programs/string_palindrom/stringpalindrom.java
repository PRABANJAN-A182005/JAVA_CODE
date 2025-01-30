import java.util.Scanner;

public class stringpalindrom {

    public static String value(String a){
        String c =a.replaceAll("[^a-zA-Z]","");
        int b = c.length();
        String d ="";
        for(int i=(b-1);i>=0;i--){
            d += c.charAt(i);
        }
        if(c.equals(d)){
            return "true";
        }
        return "true";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(value(a));
        
    }
}
