package Practice1;

public class Practice {
    public static void main(String[] args) {
        // 모금 상자 개채 얻기
        CollectionBox cb = CollectionBox.getInstance();
        // 가짜 모금 상자를 만들 수 없도록 하기(컴파일 오류)
        // CollectionBox imitation = new CollectionBox();
        // 5명의 부자(백만장자) 객체 생성
        MultiMillionaire mm1 = new MultiMillionaire(cb);
        MultiMillionaire mm2 = new MultiMillionaire(cb);
        MultiMillionaire mm3 = new MultiMillionaire(cb);
        MultiMillionaire mm4 = new MultiMillionaire(cb);
        MultiMillionaire mm5 = new MultiMillionaire(cb);
        // 모금 시작
        mm1.start();
        mm2.start();
        mm3.start();
        mm4.start();
        mm5.start();
        // 모든 사람의 모금이 끝날 때까지 기다립니다.
        try{
            mm1.join();
            mm2.join();
            mm3.join();
            mm4.join();
            mm5.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        // 모금 총액 발표
        System.out.println( "모금 총액: " + cb.getTotalAmount() + "원" );
    }
}
// 여기에 부자 클래스를 만드세요
class MultiMillionaire extends Thread{
    private CollectionBox cb;

    public MultiMillionaire(final CollectionBox cb){
        this.cb = cb;
    }
    @Override
    public void run(){
        //1원씩 100만원
        for(int i = 0; i < 1000000; i++){
            cb.contribute(1);
        }
    }
}
// 여기에 모금 상자 클래스를 만드세요.
class CollectionBox{
    private static CollectionBox cb;

    private int totalAmount;

    private CollectionBox() {}

    public static CollectionBox getInstance(){
        if(cb == null){
            cb = new CollectionBox();
        }

        return cb;
    }

    public synchronized void contribute(int money){
        totalAmount += money;
    }

    public int getTotalAmount(){
        return totalAmount;
    }
}