package chap15Practice;

public class Practice4 {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();

        System.out.println("1품목 " + chef.cook(egg, cheese) + "입니다.");
        System.out.println("2품목 " + chef.cook(rice, egg) + "입니다.");
        System.out.println("3품목 " + chef.cook(rice, cheese) + "입니다.");
        System.out.println("4품목 " + chef.cook(milk, egg) + "입니다.");
    }
}

class Egg{}
class Rice{}
class Milk{}
class Cheese{}

class Chef{
    public String cook(Egg egg, Cheese cheese){
        return "스크램블 애그";
    }
    public String cook(Rice rice, Egg egg){
        return "오므라이스";
    }
    public String cook(Rice rice, Cheese cheese){
        return "리조또";
    }
    public String cook(Milk milk, Egg egg){
        return "푸딩";
    }
}