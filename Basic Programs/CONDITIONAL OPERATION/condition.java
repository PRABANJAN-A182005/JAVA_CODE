import java.util.Random;
public class condition {

    public static String check(int a,int b){
        //condition for checking the two random value

            if(a<=b)System.out.println( "a<=b is true \na>=b is false");

            if(a<b)System.out.println( "a<b is true \na>b is false");

            if(a>=b)System.out.println( "a>=b is true \na<=b is false");

            if(a>b)System.out.println( "a>b is true \na<b is false");

            if(a==b)System.out.println( "a==b is true \na!=b is false");

            if(a!=b)System.out.println( "a!=b is true \na==b is false");

            return " ";
    }
    //main function
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        System.out.println("Random A:- "+a);
        System.out.println("Random b:- "+b);
        System.out.println(check(a, b));
        
    }
}
