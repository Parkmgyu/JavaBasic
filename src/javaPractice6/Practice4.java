package javaPractice6;

import java.util.Random;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int no = 10 + rand.nextInt(90);
        System.out.println("숫자맞추기 게임 시작!");
        System.out.println("10부터 99까지의 숫자를 맞추세요.");

        int num = 0;
        do{
            System.out.print("어떤 숫자일까?");
            num = sc.nextInt();
            if(num > no){
                System.out.println("더 작은 숫자입니다.");
            } else if(num < no){
                System.out.println("더 큰 숫자입니다.");
            }
        } while(num != no);
        System.out.println("정답입니다.");
    }
}
