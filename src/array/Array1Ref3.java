package array;

public class Array1Ref3 {

    public static void main(String[] args) {

        /**
         * 기본형 / 참조형
         * 기본형(Primitive Type) : 변수에 사용을 값을 직접 넣을 수 있는 데이터 타입
         * 참조형(Reference Type) : 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입
         *
         * 왜 참조형을 사용하는지?
         *  - 크기가 언제든지 변할 수 있기 때문에
         */

//        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10}; // 배열 생성과 초기화

        for(int i=0; i< students.length; i++) {
            System.out.println("학생"+(i+1)+" 점수 : " + students[i]);
        }

    }
}
