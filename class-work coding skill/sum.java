// 11.Program to calculate the sum from ‘M number to ‘N number.{Input M= 5 N= 10 ,Output =45}

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}
