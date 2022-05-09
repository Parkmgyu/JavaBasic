package javaPractice13;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("실수값: ");
        double real = sc.nextDouble();
        System.out.println("절대값: " + Math.abs(real));
        System.out.println("제곱근: " + Math.sqrt(real));
        System.out.println("면적: " + real * real * Math.PI);
    }
}
