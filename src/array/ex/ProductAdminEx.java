package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxProducts = 10; // ArrayList 사용시 가변적인 크기의 배열 사용가능
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> {
                    if(productCount >= maxProducts) {
                        System.out.println("상품은 최대 "+maxProducts+"개까지 등록 가능합니다.");
                        break;
                    }
                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = sc.nextInt();

                    productCount++;
                }
                case 2 -> {
                    if(productCount == 0) {
                        System.out.println("등록된 물품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                    }
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                }
                default -> {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            }

            if (option == 3) break;
        }
    }
}
