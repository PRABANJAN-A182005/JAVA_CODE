import java.util.Scanner;
public class leapyear {
    public void leapcheck(int year){
        //condition for leap year to check normal and century year.
        if((year%4==0) && (year%400==0)){
            System.out.println(year+" IS LEAP YEAR");
        }
        else{
            System.out.println(year+" IS NOT LEAP YEAR"); 
        }
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         leapyear obj = new leapyear();
         System.out.println("ENTER THE YEAR :- ");
         int year = sc.nextInt();
         obj.leapcheck(year);
    }
}
