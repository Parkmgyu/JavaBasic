package javaPractice8.Practice3;

public class Picture {
    private String target;

    public Picture(String target){
        this.target = target;
    }

    @Override
    public String toString(){
        return target + " 이미지";
    }
}
