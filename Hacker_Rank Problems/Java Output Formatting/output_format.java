import java.util.Scanner;

public class output_format {
    //Main function is defined
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            //loop and variable declaration take place
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                int lenght=s1.length();
              
                for(int j=lenght;j<=15;j++){
                if(j!=15){
                    s1+=" ";
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




