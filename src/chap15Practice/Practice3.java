package chap15Practice;

public class Practice3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setData("홍길동", 30);

        Person p2 = new Person();
        p2.setData("이순신", 31);

        Person p3 = new Person();
        p3.setData("이산", 33);

        Person p4 = new Person();
        p4.setData("강산", 31);

        Person p5 = new Person();
        p5.setData("이이", 31);

        Person p6 = new Person();
        p6.setData("유흥", 33);

        System.out.println(p1.introducce());

        System.out.println(p2.introducce());

        System.out.println(p3.introducce());

        System.out.println(p4.compare(p4, p2));

        System.out.println(p5.compare(p5, p3));

        System.out.println(p6.compare(p6, p2));
    }

}
class Person{
    private String name;
    private int age;

    public void setData(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String introducce(){
        return "내 이름은 " + name + ", 나이는 " + age + "세입니다.";
    }

    public String compare(Person p1, Person p2){
        if(p1.getAge() > p2.getAge()){
            return "나는 " + p1.getName() + "이고 " + p2.getName() + "님보다 " + (p1.getAge() - p2.getAge()) + "살 연상입니다.";
        } else if(p1.getAge() == p2.getAge()){
            return "나는 " + p1.getName() + "이고 " + p2.getName() + "님과 같은 나이 입니다.";

        } else {
            return "나는 " + p1.getName() + "이고 " + p2.getName() + "님보다 " + (p2.getAge() - p1.getAge()) + "살 연하입니다.";
        }

    }
}