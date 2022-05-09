package javaPractice7;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학급 수 : ");

        int classNum = sc.nextInt();
        int[][] point = new int[classNum][];
        int totNumber = 0;

        for(int i = 0; i < point.length; i++){
            System.out.printf("\n%d반의 학생수: ", i + 1);
            int num = sc.nextInt();
            point[i] = new int[num];
            totNumber += num;
            for(int j = 0; j < point[i].length; j++){
                System.out.printf("%d반 %d번의 점수: ", i + 1, j + 1);
                point[i][j] = sc.nextInt();
            }

        }
        System.out.println("   반   |      합계     평균 ");
        System.out.println("------------------------------------");
        int total = 0;
        for(int i = 0; i < point.length; i++){
            int sum = 0;
            for(int j = 0; j < point[i].length; j++) {
                sum += point[i][j];
            }
            total += sum;
            System.out.printf("%2d반 : %7d%7.1f\n", i + 1, sum, (double)sum / point[i].length);
        }
        System.out.println("------------------------------------");
        System.out.printf("합계 %7d%7.1f\n", total, (double)total / totNumber);
    }
}
