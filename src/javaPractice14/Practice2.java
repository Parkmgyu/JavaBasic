package javaPractice14;

public class Practice2 {
    public static void main(String[] args) {
    Human2 gildong = new Human2("홍길동", 170, 60);
    Human2 sunshin = new Human2("이순신", 169, 72);

    gildong.gainWeight(3);
    sunshin.reduceWeight(4);

    System.out.println("이름: " + gildong.getName());
    System.out.println("신장: " + gildong.getHeight() + "cm");
    System.out.println("체중: " + gildong.getWeight() + "kg");

    System.out.println();
    System.out.println("이름: " + sunshin.getName());
    System.out.println("신장: " + sunshin.getHeight() + "cm");
    System.out.println("체중: " + sunshin.getWeight() + "kg");

}
}
class Human2{
    private String name;
    private int height;
    private int weight;

    Human2(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    String getName(){
        return name;
    }

    int getHeight(){
        return height;
    }

    int getWeight(){
        return weight;
    }

    void gainWeight(int w){
        weight += w;
    }

    void reduceWeight(int w){
        weight -= w;
    }
}
