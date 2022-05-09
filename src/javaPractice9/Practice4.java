package javaPractice9;

public class Practice4 {
    public static void main(String[] args) {
        Musician[] band = {new Vocalist("홍길동"), new Guitarist("이순신", "리드 기타"), new Guitarist("이빛나", "베이스"), new ChorusDrummer("이빛나")};

        for(int i = 0; i < band.length; i++){
            if(band[i] instanceof Singable){
                ((Singable)band[i]).sing();
            }
            if(band[i] instanceof Playable){
                ((Playable)band[i]).play();
            }
        }
    }

}
abstract class Musician{
    private String name;

    public Musician(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
interface Singable{
    void sing();
}

interface Playable{
    void play();
}

class Vocalist extends Musician implements Singable{
    public Vocalist(String name){
        super(name);
    }

    public void sing(){
        System.out.println(getName() + "은 열창했습니다!");
    }
}

class Guitarist extends Musician implements Playable{
    private String guitarType;

    public Guitarist(String name, String guitarType){
        super(name);
        this.guitarType = guitarType;
    }

    public void play(){
        System.out.println(getName() + "은 " + guitarType + "을 연주했습니다.");
    }
}
class ChorusDrummer extends Musician implements Singable, Playable{
    public ChorusDrummer(String name){
        super(name);
    }

    public void sing(){
        System.out.println(getName() + "은 코러스로 연주했습니다.");
    }

    public void play(){
        System.out.println(getName() + "은 드럼을 연주했습니다.");
    }
}
