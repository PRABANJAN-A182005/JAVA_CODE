import java.io.*;
import java.util.*;

public class string_intro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Reading two strings from the user
        String A = sc.next();
        String B = sc.next();
        
        // Concatenating the strings and printing the total length
        String C = A + B;
        int c = C.length();
        System.out.println(c);
        
        // Comparing the two strings lexicographically
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Capitalizing the first letter of each string and printing the result
        String a = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(a + " " + b);
    }
}
