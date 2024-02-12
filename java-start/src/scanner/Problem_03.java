package scanner;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력:");
        String food = scanner.nextLine();

        System.out.print("음식 가격:");
        int price = scanner.nextInt();

        System.out.print("음식 수량:");
        int num = scanner.nextInt();

        System.out.println(food+" "+num+"개를 주문하셨습니다. 총 가격은"+price*num+"원입니다.");
    }
}
