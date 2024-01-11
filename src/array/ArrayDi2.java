package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 3x3 2차원 배열 생성
        int[][] arr = new int[13][5];

        int cnt = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = cnt++;
                System.out.print (" arr["+i+"]["+j+"] = " + arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
