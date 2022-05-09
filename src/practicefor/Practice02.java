package practicefor;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, avr = 0, total = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("정수 입력 : ");
            num = sc.nextInt();
            total += num;
        }
        avr = total / 10;
        System.out.println(avr);
    }
}
