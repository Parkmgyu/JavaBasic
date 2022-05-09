package chap08;

public class ForLoopWithArray {
    public static void main(String[] args){
        // 배열변수 선언과 요소 만들기
        int[] intArray = new int[3];

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = 100;
            System.out.println("intArray["+i+"]값: " + intArray[i]);
        }
    }
}
