package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 숫자 입력 : ");
        int num1 = scanner.nextInt();

        System.out.println("둘 숫자 입력 : ");
        int num2 = scanner.nextInt();

        if(num1 == num2) {
            System.out.println("두 숫자는 같습니다.");
        } else {
            System.out.println("두 숫자중 큰 값 : " + Math.max(num1, num2));
        }
    }
}
