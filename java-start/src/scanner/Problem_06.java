package scanner;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자 입력");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자 입력");
        int num2 = scanner.nextInt();
        System.out.print("두 숫자 사이의 모든 정수: ");
        for(int i = num1; i <= num2; i ++){
            if(i != num2){
                System.out.print(i);
                System.out.print(",");
            }
            else{
                System.out.print(i);
            }
        }
    }
}
