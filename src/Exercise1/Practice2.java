package Exercise1;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 입력: ");
        int num = sc.nextInt();

        if(num > 5 && num < 20){
            System.out.println("성공");
        }
    }
}
