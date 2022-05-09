package chap20;

public class UseSubClass1 {
    public static void main(String[] args) {
        // 서브클래스 객체 생성
        NoteBook1 nb = new NoteBook1();

        // 슈퍼 클래스 맴버 호출
        nb.setOsMemory("Windows11", 32);

        // 서브클래스 멤버 호출
        nb.setUseType("모바일");

        // 슈퍼클래스 멤버 호출
        nb.show();
    }
}
