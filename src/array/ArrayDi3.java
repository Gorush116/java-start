package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 3x3 2차원 배열 생성, 초기화
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // 행3, 열3

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(" arr["+i+"]["+j+"] = " + arr[i][j] );
            }
            System.out.println();
        }

    }
}
