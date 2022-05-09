package chap10Exercise;

class Person02 {
    String name; // 이름
    int age; // 나이

    // 필드변수의 값을 화면에 메시지로 보냄
    public void showPerson() {
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "살입니다.");
    }
}
class Person03{
    String name; // 이름
    int age; // 나이

    // 필드변수의 값을 화면에 메시지로 출력
    public void showPerson() {
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "입니다.");
    }

    // 메소드1
    public void setName(String name){
        this.name = name;
        System.out.println("이름은 " + name + "이고, ");
    }

    // 메소드2
    public void setAge(int age){
        this.age = age;
        System.out.println("나이는 " + age + "입니다.");
    }

    // 메소드3
    public String getName(){
        return this.name;
    }

    // 메소드4
    public int getAge(){
        return this.age;
    }
}
public class Practice0201 {
    public static void main(String[] args) {
        Person02 person01 = new Person02();
        Person02 person02 = new Person02();

        Person03 person03 = new Person03();

        person01.name = "lee";
        person01.age = 26;

        person02.name = "park";
        person02.age = 31;

        person03.name = "kim";
        person03.age = 24;

        person01.showPerson();
        person02.showPerson();
        person03.showPerson();
    }
}
