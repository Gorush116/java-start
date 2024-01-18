package method;

public class MethodValue0 {

    public static void main(String[] args) {
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        int num1 = 5;
        int num2 = num1; // 값을 복사해서 대입하는 부분(num1에 있는 값 5를 복사해서 num2에 넣는 것)
        // 0. **** num1 변수 자체가 들어가는 것이 아니라 num1에 들어있는 값을 읽고 복사해서 num2에 넣는 것 ****
        // 1. num1의 값은 5이다. num1(5)
        // 2. num2 변수에 대입하기 전에 num1의 값 5를 읽는다. 결과 : num1(5), num2(5)
        // 3. num2에 10을 대입한다. 결과 : num(1), num2(10)
        num2 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
