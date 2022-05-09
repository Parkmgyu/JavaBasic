package javaPractice14;

public class Practice1 {
    public static void main(String[] args) {
        Human gildong = new Human();
        Human sunshin = new Human();

        gildong.name = "홍길동";
        gildong.height = 170;
        gildong.weight = 60;

        sunshin.name = "이순신";
        sunshin.height = 169;
        sunshin.weight = 72;

        System.out.println("이름: " + gildong.name);
        System.out.println("신장: " + gildong.height);
        System.out.println("체중: " + gildong.weight);

        System.out.println();
        System.out.println("이름: " + sunshin.name);
        System.out.println("신장: " + sunshin.height);
        System.out.println("체중: " + sunshin.weight);

    }
}
class Human{
    String name;
    int height;
    int weight;

}
