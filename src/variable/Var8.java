package variable;

public class Var8 {

    public static void main(String[] args) {

        //정수
        byte b = 127; //-128 ~ 127 -> 2^8
        short s = 32767; // -32,768 ~ 32,767 -> 2^16
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억) -> 2^32

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 -> 2^64
        long l = 9223372036854775807L;
        //실수
        float f = 10.0f;
        double d = 10.0; // 실무에서 소숫점 사용시 double 사용 > float는 잘 사용하지 않음

        // ctrl + d : 해당 줄 복사, ctrl + x : 해당 줄 삭제

    }
}
