package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println(a + "와(과) " + b + "중 더 큰 숫자는 " + max + " 입니다.");
    }
}
