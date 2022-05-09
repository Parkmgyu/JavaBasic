package FirstJava;

import java.util.Arrays;

public class ChangeArr {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 4, 2, 1, 5};

        System.out.print("{");
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                arr[i] = arr[i + 1];
            }
            System.out.print(arr[i] + ", ");
        }
        for(int i = arr.length - 1; i < arr.length; i++){
            System.out.print(arr[i] + "}");
        }

    }
}
