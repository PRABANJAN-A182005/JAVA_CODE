import java.util.Scanner;
public class PrimeNo {
    //method to find prime number
    public void primeNo(int n){
        int result = 0;
        int i;
        //prime 2 checking statement
        if (n!=1&&n==2){
            System.out.println(n +" IS A PRIME NUMBER");
        }
        //logic to find prime number
        else {
            //moduloes taken from 2 to n-1
            for(i=2; i<=n ; i++){
                if (n%i==0){
                    result+=1;
                }    
            }
            //print condition
            if (result==1){
                System.out.println(n +" IS A PRIME NUMBER");
            }
            else if(result!=1){
                System.out.println(n +" IS NOT A PRIME NUMBER");
            }   
        }  
    }
    //MAIN FUNCTION
    public static void main(String[] args) {
        PrimeNo obj = new PrimeNo();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        obj.primeNo(n);
    }
}
