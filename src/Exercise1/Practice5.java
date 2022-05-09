package Exercise1;

public class Practice5 {
    public static void main(String[] args) {
/*        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < arr.length; j++){
                if(j >= i && j <= 10 - i){
                    System.out.print(arr[j]);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/

        int[] a = new int[11];
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i <= 6; i++){
            for(int j = 0; j < a.length; j++){
                if(j < i || j > a.length - i - 1){
                    System.out.print(" ");
                }else{
                    System.out.print(a[j]);
                }
            }
            System.out.println();
        }
    }
}
