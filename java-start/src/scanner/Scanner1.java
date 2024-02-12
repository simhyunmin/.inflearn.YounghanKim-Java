package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("문자열을 입력:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);

        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: "+intValue);

        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: "+doubleValue);


        //* Scanner scanner = new Scanner(System.in);
        //  * 이 코드는 객체와 클래스를 배워야 정확히 이해할 수 있다. 지금은 `Scanner`의 기능을 사용하기 위해 `new`를 사용해서
        //      `Scanner`를 만든다 정도로 이해하면 된다. `Scanner`는 `System.in`을 사용해서 사용자의 압력을 편리하게 받도록 도와준다.
        //  * `Scanner scanner`코드는 `scanner` 변수를 선언하는 것이다. 이제부터 `scanner`변수를 통해서 `scanner`를 사용할 수 있다.
        //* `scanner .nextLine()`
        //  * 엔터(`\n`)를 입력할 때까지 문자를 가져온다.
        //* `scanner.nextInt()`
        //  * 입력을 `int`형으로 가져온다. 정수 입력에 사용한다.
        //* `scanner.nextDouble()`
        //  * 입력을 `double`형으로 가져온다. 실수 입력에 사용한다.



    }
}
