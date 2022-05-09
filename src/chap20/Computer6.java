package chap20;

public class Computer6 {
    protected String os;
    protected int memory;

    public Computer6(){
        this.os = null;
        this.memory = 0;
        System.out.println("PC를 만들었습니다.");
    }

    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "와 메모리는 " + memory + "GB로 변경했습니다.");
    }

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리크기는 " + memory + "GB입니다.");
    }
    // 재정의된 toString 메소드
    public String toString(){
        String str = "OS: " + this.os + " " + "Memory:" + this.memory;
        return str;
    }
}
