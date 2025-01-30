import java.util.Scanner;

public class washingmechine {
    public static  void ModeOfOperation(int l,String m){
        if(m.equals("l")||m.equals("m")||m.equals("g")){
            if(l<=2000 && m.equals("l")){
                System.out.println("Duration :- 25min");
            }
            if(l>2000 && l<=4000 && m.equals("m")){
                System.out.println("Duration :- 35min");
            }
            if(l>4000 && l<=7000 && m.equals("g")){
                System.out.println("Duration :- 45min");
            }
            if(l>7000){
                System.out.println("OVERLOADED");
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the load of water in washing mechine:- ");
        int load = in.nextInt();
        System.out.print("enter the mode of operation in washing mechine \nthe modes are (l-Large, m-Medium, g-Large)");
        String mode = in.next();
        ModeOfOperation(load,mode);

    }
}
