package variable.ex;

public class VarEx1Question {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;

        System.out.println("num1 + num2 : " + (num1 + num2));
        System.out.println("num1 - num2 : " + (num1 - num2));
        System.out.println("num1 * num2 : " + (num1 * num2));

        System.out.println("--------------------------------------------------------------");

        num1 = 10;
        num2 = 20;
        int sum = num1 + num2;
        // 1. 읽기(num1 + num2) -> 2. 계산 -> 3. 대입

        System.out.println("num1 + num2 : " + (num1 + num2));
        System.out.println("num1 - num2 : " + (num1 - num2));
        System.out.println("num1 * num2 : " + (num1 * num2));
        System.out.println("sum : " + sum);

        System.out.println("--------------------------------------------------------------");

        long longVar = 10000000000L;
        boolean flag = true;

        System.out.println("long : " + longVar);
        System.out.println("boolean : " + flag);

    }
}
