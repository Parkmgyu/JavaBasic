package javaPractice9;

public class Practice3 {
    public static void main(String[] args) {
        Athlete[] athlete = {new Swimmer("홍길동"), new MarathonRunner("이순신"), new Swimmer("이빛나"), new MarathonRunner("김선두")};

        for(int i = 0; i < athlete.length; i++){
            System.out.println(athlete[i]);
        }
        System.out.println();

        for(int i = 0; i < athlete.length; i++){
            if(athlete[i] instanceof Swimmer){
                ((Swimmer)athlete[i]).swim();
            }else if(athlete[i] instanceof MarathonRunner){
                ((MarathonRunner)athlete[i]).run();
            } else{
                System.out.println("알수없음");
            }
        }
    }
}

abstract class Athlete{
    protected String name;

    public abstract String getType();
    @Override
    public String toString(){
        return "내 이름은 " + name + "," + getType() + " 선수입니다.";
    }
}

class Swimmer extends Athlete{
    public static final String TYPE = "수영";

    public Swimmer(String name){
        this.name = name;
    }

    public String getType(){
        return TYPE;
    }

    public void swim(){
        System.out.println(name + "은 수영을 했습니다.");
    }
}

class MarathonRunner extends Athlete{
    private String TYPE = "마라톤";

    public MarathonRunner(String name){
        this.name = name;
    }

    public String getType(){
        return TYPE;
    }

    public void run(){
        System.out.println(name + "이 달렸습니다.");
    }
}
