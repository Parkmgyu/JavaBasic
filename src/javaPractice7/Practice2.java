package javaPractice7;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] kor = new int[6];
        int[] math = new int[6];
        double[] avg = new double[6];
        double totalKor = 0;
        double totalMath = 0;
        double avgKor = 0;
        double avgMath = 0;
        System.out.println("6명의 국어, 수학점수를 입력하세요.");
        for(int i = 0; i < 6; i++){
            System.out.print((i + 1) + "번 국어 : ");
            kor[i] = sc.nextInt();
            System.out.print("수학 : ");
            math[i] = sc.nextInt();
            avg[i] = (double) (kor[i] + math[i]) / 2;
            totalMath += (math[i]);
            totalKor += (kor[i]);
            avgMath = totalMath / 6;
            avgKor = totalKor / 6;
        }
        System.out.println("No.``국어    수학    평균");
        for(int i = 0; i < 6; i++){
            System.out.println((i + 1) + "    " + kor[i] + "     " + math[i] + "     " + avg[i]);
        }
        System.out.println("평균  " + avgKor + " " + avgMath);
    }
}
