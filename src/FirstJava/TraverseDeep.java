package FirstJava;

public class TraverseDeep {
    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        traverse(map, 1, 1);
        char[] ch = {'.', '*', 'G', 'o'};
        for(int[] row : map){
            for(int cell : row){
                System.out.print(ch[cell]);
            }
            System.out.println();
        }
    }

    static boolean traverse(int[][] map, int curX, int curY) {
        switch(map[curY][curX]){
            case 0: break; // 통로이므로 계속 처리
            case 2: return true; // 목표 (골)
            default: return false; // 통과불가
        }
        map[curY][curX] = 3; // 지나간이동 표시
        if(traverse(map, curX + 1, curY) ||
                traverse(map, curX - 1, curY) ||
                traverse(map, curX, curY + 1) ||
                traverse(map, curX, curY - 1)){
            return true;
        }

        map[curY][curX] = 0; // 목표(골)에 도달하지 않았기 때문에 통과한 표시를 리턴함
        return false;
    }
}
