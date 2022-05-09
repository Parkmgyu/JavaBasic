package Exercise1;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("정수값 입력: ");
            int num = sc.nextInt();
            total += num;
        }

        System.out.println("값의 합: " + total);

    }
}
