package javaPractice9;

public class Practice2 {
    public static void main(String[] args) {
        SoccerPlayer fwd = new CenterForward("홍길동", 11);

        System.out.println(fwd);

        fwd.kickBall();
        fwd.catchBall();
        System.out.println();

        SoccerPlayer keeper = new GoalKeeper("이순신", 12);

        System.out.println(keeper);

        keeper.kickBall();
        keeper.catchBall();
    }
}

abstract class SoccerPlayer{
    private String name;
    private int uniformNumber;

    public SoccerPlayer(String name, int uniformNumber){
        this.name = name;
        this.uniformNumber = uniformNumber;
    }

    public String getName(){
        return name;
    }

    public void kickBall(){
        System.out.println(name + "은 공을 찼습니다.");
    }

    public void catchBall(){
        System.out.println(name + "은 볼을 발로 받았습니다.");
    }

    public abstract String getPositionName();

    @Override
    public String toString(){
        return getPositionName() + " " + name + " 등번호 " + uniformNumber;
    }
}

class CenterForward extends SoccerPlayer{
    private static final String POSITION_NAME = "센터포워드";

    public CenterForward(String name, int uniformNumber){
        super(name, uniformNumber);
    }

    public String getPositionName(){
        return POSITION_NAME;
    }
}

class GoalKeeper extends SoccerPlayer{
    private static final String POSITION_NAME = "골키퍼";

    public GoalKeeper(String name, int uniformNumber){
        super(name, uniformNumber);
    }

    public String getPositionName(){
        return POSITION_NAME;
    }

    @Override
    public void catchBall(){
        System.out.println(getName() +"은 공을 손으로 받았습니다.");
    }
}
