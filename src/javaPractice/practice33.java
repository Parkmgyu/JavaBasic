package javaPractice;

import java.util.Scanner;

public class practice33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("zero");
        } else{
            System.out.println("not zero");
        }
    }
}
