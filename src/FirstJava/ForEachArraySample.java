package FirstJava;

public class ForEachArraySample {
    public static void main(String[] args) {
        var nums = new String[] {"홍길동", "이순신", "신사임당"};
//        var nums = new int[]{2, 3, 5, 7};
        for(String num : nums){
            System.out.println(num);
        }
    }
}
