package chap18.Practice2;

public class Computer2 {
    private String os;
    private int memory;

    // 생성자
    public Computer2(){
        this.os = "";
        this.memory = 0;

        System.out.println("PC가 만들어졌습니다.");
    }
    /*
    * 접근자 메소드
     */
    public String getOs() {
        return os;
    }

    public int getMemory(){
        return memory;
    }

    public void setOs(String os){
        this.os = os;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}
