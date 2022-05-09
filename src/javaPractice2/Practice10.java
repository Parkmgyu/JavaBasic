package javaPractice2;

public class Practice10 {
    public static void main(String[] args) {
        int[] points = {
                69 , 40 , 88 , 68 , 13 , 62 , 45 , 43 , 28 , 69 ,
                54 , 77 , 81 , 34 , 41 , 78 , 59 , 21 , 45 , 64 ,
                55 , 18 , 63 , 80 , 64 , 26 , 52 , 44 , 61 , 50 ,
                44 , 82 , 56 , 74 , 67 , 98 , 58 , 84 , 77 , 70 ,
                60 , 77 , 64 , 89 , 59 , 74 , 21 , 66 , 85 , 68 ,
                90 , 48 , 64 , 80 , 63 , 47 , 70 , 79 , 51 , 66 ,
                23 , 84 , 57 , 57 , 76 , 60 , 100 , 66 , 79 , 61 ,
                47 , 66 , 76 , 45 , 90 , 69 , 72 , 51 , 86 , 64 ,
                57 , 51 , 42 , 60 , 71 , 69 , 7 , 62 , 77 , 61 ,
                43 , 50 , 68 , 30 , 78 , 58 , 40 , 62 , 70 , 22
        };

        int sum = 0;

        for(int i = 0; i < points.length; i++){
            sum += points[i];
        }

        System.out.println("평균점수: " + ((double)sum / points.length));

        System.out.println("히스토그램");
        for(int i = 0; i < 10; i++){
            if(i == 0){
                System.out.print("0점대 ");
            } else {
                System.out.print((i * 10) + "점대");
            }

            for(int j = 0; j < points.length; j++){
                if(points[j] >= (i * 10) && points[j] < ((i + 1) * 10)){
                    System.out.print("*");
                }

                if(i == 9 && points[j] == 100){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
