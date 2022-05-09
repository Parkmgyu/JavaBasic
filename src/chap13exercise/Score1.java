package chap13exercise;

public class Score1 {

    String name; // 이름
    int[] score = new int[5]; // 5교과 점수 저장용 배열
    int total; // 총점
    double ave; // 평균;

    public Score1() {
        this.score = null;
        this.total = 0;
        this.ave = 0;
        System.out.println("평균이 생성되었습니다.");
    }

    public void show(){
        System.out.println("점수는 " + score + "이고, 합계는 " + total + "이며, 평균은 " + ave + "입니다.");
    }
}
