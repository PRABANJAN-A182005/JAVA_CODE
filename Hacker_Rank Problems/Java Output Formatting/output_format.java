import java.util.Scanner;
//defined package and class
public class output_format {
    //Main function is defined
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            //loop and variable declaration take place
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //length determine by buildIn (function)method
                int lenght=s1.length();
                //Complete this line using for loop and logic
                for(int j=lenght;j<=15;j++){
                if(j!=15){// using if for check the string size less than 15char
                    s1+=" ";//then increment with emptspace
                }
                }
                //integer format change to string because to print the integerexpressed in exactly digits; if the original input has less than three digits, pad output leading digits with zeroes. 
                String num = String.format("%03d", x);
                //print statement
                System.out.print(s1);
                System.out.println(num);
            }
            System.out.println("================================");

    }
}




