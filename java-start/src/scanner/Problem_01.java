package scanner;

import java.util.Scanner;
public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 입력");
        String name = scanner.nextLine();

        System.out.println("나이 입력");
        int age = scanner.nextInt();

        System.out.println("이름 : "+name + " 나이 : " + age);
    }
}
