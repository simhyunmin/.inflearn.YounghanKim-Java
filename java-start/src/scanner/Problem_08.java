package scanner;

import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.print("상품 가격:");
            int price = scanner.nextInt();

            if(price == -1){
                break;
            }

            System.out.print("구매 수량:");
            int num = scanner.nextInt();

            System.out.println("총비용 : " + price*num);
        }
    }
}
