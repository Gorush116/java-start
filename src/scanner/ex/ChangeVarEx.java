package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        temp = a;   // 임시보관소에 값 보관
        a = b;      // b -> a 대입
        b = temp;   // temp -> b 대입

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }
}
