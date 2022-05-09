package javaPractice;

public class PracticeMiddle {
    public static void main(String[] args) {
        taxi(2100);
    }

    public static void taxi(double dist){
        double cost;
        if(dist <= 1700){
            cost = 6100;
        } else {
            cost = 6100 + (dist - 1700) / 313 * 800;
        }
        System.out.println(cost);
    }
}
