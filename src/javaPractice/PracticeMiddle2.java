package javaPractice;

public class PracticeMiddle2 {
    public static void main(String[] args) {
        artMuseum(21);
    }
    public static void artMuseum(int person){
        int cost = 0;
        if(person < 5){
            cost = 6000 * person;
        } else if(person < 20){
            cost = 5500 * person;
        } else{
            cost = 5000 * person;
        }
        System.out.println(cost);
    }
}
