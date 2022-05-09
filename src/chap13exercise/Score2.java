package chap13exercise;

public class Score2 {
    String name; // 이름
    int[] score = new int[5]; // 5교과 점수 저장용 배열
    int total; // 총점
    double ave; // 평균점

    public Score2(String name, int[] score, int total, double ave){
        this.name = name;
        this.total = total;
        this.ave = ave;

        for(int i = 0; i < this.score.length; i++){
            this.score[i] = score[i];
        }

        this.total = total;

        this.ave = ave;
    }
}
