package Exercise1;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 입력: ");
        int num = sc.nextInt();

        if((num > -10 && num < 0) || num > 10){
            System.out.println("성공");
        }else{
            System.out.println("실패");
        }
    }
}
