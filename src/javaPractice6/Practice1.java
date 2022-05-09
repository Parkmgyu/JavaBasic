package javaPractice6;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        int diff;
        if(a >= b){
            diff = a - b;
        } else {
            diff = b - a;
        }
        System.out.println("두값의 차이는 " + diff + "입니다");
    }
}
