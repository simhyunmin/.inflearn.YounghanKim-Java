package scanner;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if(option == 1){
                scanner.nextLine();
                System.out.println("상품명을 입력하세요:");
                String product = scanner.nextLine();

                System.out.println("상품 가격 입력: ");
                int price = scanner.nextInt();

                System.out.println("상품 수량:");
                int num = scanner.nextInt();
                totalCost = price * num;
                System.out.println("상품명 : "+ product + "상품 가격 : "+ price + " 상품 수량 : "+ num+" 총 가격 : "+ totalCost);

            }else if(option == 2){
                System.out.println("총가격 : " + totalCost);

            }else if (option == 3){
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println("올바른 옵션 선택");
            }

        }

    }
}
