package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

        while(true){
            System.out.println("첫 번째 숫자 입력");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자 입력");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0){
                System.out.println("프로그램 종료");
                break;
            }

            int sum = num1 + num2;

        }
    }
}
