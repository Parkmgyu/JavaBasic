package FirstJava;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        Animal[] myPets = new Animal[4];

        myPets[0] = new Cat();
        myPets[1] = new Dog();
        myPets[2] = new Cat();
        myPets[3] = new Dog();

        for(Animal pet: myPets){
            pet.speak();
        }
        myCat.Name = "고양";
        myCat.Age = 3;
        myCat.showProfile();
        myCat.sleep();
        myCat.speak();

        myDog.Name = "바둑이";
        myDog.Age = 4;
        myDog.showProfile();
        myDog.run();
        myDog.speak();
    }
}

class Animal
{
    public String Name;
    public int Age;

    public void showProfile()
    {
        System.out.println("이름은 " + Name + "이고 " + Age + "살입니다." );
    }

    public void speak(){
        System.out.println("........");
    }
}

class Cat  extends Animal{
    public void sleep(){
        System.out.println("야오야오");
    }
    public void speak(){
        System.out.println("야옹 야옹");
    }

}

class Dog extends Animal{
    public void run(){
        System.out.println("달려 달려");
    }

    public void speak(){
        System.out.println("멍 멍");
    }
}

