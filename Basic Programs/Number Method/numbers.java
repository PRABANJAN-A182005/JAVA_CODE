// 1.Imagine you have two randomly chosen numbers, and your goal is to write a program 
// that adds them together. How will you set up your program to generate these numbers 
// and calculate their sum?
// 2. You have two numbers, and your task is to write a program that reads these numbers 
// and calculates their sum. How will you make sure the program adds them together 
// correctly and shows the result?
// 3.You have three numbers, and your challenge is to write a program that reads these 
// numbers and computes their total sum. How will you ensure your program adds them all 
// together to give the final result?
// 4.Imagine you have two mysterious numbers. Your task is to write a program that 
// reveals which one of them is the bigger one. How will you solve this puzzle?
import java.util.Scanner;
import java.util.Random;


public class numbers {
    // Method To Sum Of Two Random Generated Number
    public int RandomGeneratedNumberSum(){
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        System.out.println("Random A:- "+a);
        System.out.println("Random b:- "+b);
        return a+b;

    }
    // Method For Sum Of Two Numbers
    public int TwoNumberSum(int a, int b){
        int c = a+b;
        return c;

    }
    // Method For Sum Of Three Number
    public int ThreeNumberSum(int a, int b, int c){
        int d = a+b+c;
        return d;

    }
    // Method For To Find Greatest OF Two Numbers
    public int BiggerOne(int a, int b){
        int c = 0;
        if(a<b){
            c=b;
        }
        else if(b<a){
            c=a;
        }
        return c;

    }
    // Main Function
    public static void main(String[] args) {
        numbers obj = new numbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:-");
        int a = sc.nextInt();
        System.out.println("Enter B:-");
        int b = sc.nextInt();
        System.out.println("Enter C:-");
        int c = sc.nextInt();
        // Function Call
        System.out.println("Sum Of Two Random number :- "+ obj.RandomGeneratedNumberSum());
        System.out.println("Sum Of Two I/P Number :- "+ obj.TwoNumberSum(a, b));
        System.out.println("Sum Of Three I/P Number :- "+ obj.ThreeNumberSum(a, b, c));
        System.out.println("Grestest Number From I/P Number is :- "+obj.BiggerOne(a, b));
    }
}
