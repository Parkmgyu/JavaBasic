package javaPractice6;


import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a: ");
        int a = sc.nextInt();
        System.out.print("정수b: ");
        int b = sc.nextInt();
        System.out.print("정수c: ");
        int c = sc.nextInt();

        if(a > b){
            int t = a;
            a = b;
            b = t;
        }

        if(b > c){
            int t = b;
            b = c;
            c = t;
        }

        if(a > c){
            int t = a;
            a = c;
            c = t;
        }

        System.out.println("변수a: " + a);
        System.out.println("변수b: " + b);
        System.out.println("변수c: " + c);
    }
}
