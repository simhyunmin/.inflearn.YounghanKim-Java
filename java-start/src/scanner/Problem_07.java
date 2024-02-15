package scanner;

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = scanner.nextLine(); //라인까지 입력받은 즉 (\n)이것도 가져감

            if(name.equals("종료")){
                break;
            }
            System.out.print("나이를 입력하세요:");
            int age = scanner.nextInt();        //\n 뺴고 숫자만 입력받아서 \n가 남아있음
//            scanner.nextLine();                 //그냥 nextInt() 다음에는 nextLine()을 통해 비워준다고만 인지


            System.out.println("이름 : "+name + " "+ "나이 : " + age);
        }
    }
}
