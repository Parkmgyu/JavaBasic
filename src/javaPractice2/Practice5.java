package javaPractice2;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        practice5();
    }
    public static void practice5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("value:");
        int value = sc.nextInt();
        sc.close();

        if(value % 2 == 0){
            System.out.println("짝수");
        } else{
            System.out.println("홀수");
        }

        if(value % 3 == 0){
            System.out.println("3의 배수입니다.");
        }
        if(value % 4 == 0){
            System.out.println("4의 배수입니다.");
        }
        if(value % 5 == 0){
            System.out.println("5의 배수입니다.");
        }
    }
}
