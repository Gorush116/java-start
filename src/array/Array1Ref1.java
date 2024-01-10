package array;

public class Array1Ref1 {

    public static void main(String[] args) {

        /**
         * 기본형 / 참조형
         * 기본형(Primitive Type) : 변수에 사용을 값을 직접 넣을 수 있는 데이터 타입
         * 참조형(Reference Type) : 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입
         *
         * 왜 참조형을 사용하는지?
         *  - 크기가 언제든지 변할 수 있기 때문에
         */

        int[] students;     // 배열 변수 선언
        students = new int[5];

        // 변수 값 대입
        students[0] = 90;
        //1. 배열에 값을 대입
        //2. 변수에 있는 참조값(배열의 메모리 주소)을 통해 실제 배열에 접근. 인덱스를 사용해서 해당 위치의 요소에 접근
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("students[0] = " + students[0]);
        System.out.println("students[1] = " + students[1]);
        System.out.println("students[2] = " + students[2]);
        System.out.println("students[3] = " + students[3]);
        System.out.println("students[4] = " + students[4]);

    }
}
