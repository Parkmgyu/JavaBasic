package Exercise1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수: ");
        int num2 = sc.nextInt();

        int result1 = num1 / num2;
        System.out.println("num1 / num2 = " + result1);

        int result2 = result1 * num2;
        System.out.println("(num1 / num2) * num2 = " + result2);
    }
}
