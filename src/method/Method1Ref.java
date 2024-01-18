package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력 : " + sum1);
        System.out.println("==========================================");

        // 계산2
        int sum2 = add(15, 20); // 인수(Argument) : 넘기는 값(15, 20)
        System.out.println("결과2 출력 : " + sum2);
        
    }

    public static int add(int a, int b) { // 매개변수(Parameter) : 들어가는 수(int a, int b)
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

}
