package javaPractice2.Practice1;

public class Pitcher extends BaseballPlayer {
    private double era;

    public Pitcher(String name, int uniformNumber, double battingAverage, double era){
        this.name = name;
        this.uniformNumber = uniformNumber;
        this.battingAverage = battingAverage;
        this.era = era;
    }

    public void introduce(){
        System.out.print("선수명: " + name + "\n등번호: " + uniformNumber + "\n타율: " + battingAverage + "\n방어율: " + era);
    }
}
