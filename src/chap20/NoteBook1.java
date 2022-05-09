package chap20;

import chap20.Computer1;

// Computer1클래스를 상속
public class NoteBook1  extends Computer1 {
    private String useType; // 용도유형

    public NoteBook1(){
        this.useType = null;
        System.out.println("노트북을 만들었습니다.");
    }

    public void setUseType(String useType){
        this.useType = useType;
        System.out.println("유형은 " + this.useType + "을 사용했습니다.");
    }
}
