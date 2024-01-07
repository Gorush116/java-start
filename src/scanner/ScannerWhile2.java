package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        while(true) {
            System.out.println("첫 번째 숫자를 입력하세요.(두 개의 숫자 0 입력시 종료) : ");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력하세요.(두 개의 숫자 0 입력시 종료) : ");
            int num2 = scanner.nextInt();

            if ( num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println(" 두 숫자의 합 : " + (num1 + num2));

        }
    }
}
