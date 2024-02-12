package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println(div1); //1

        double div2 = 3/2;
        System.out.println(div2); //1.0

        double div3 = 3.0 / 2.0;
        System.out.println(div3);  //1.5

        double div4 = (double) 3 / 2;
        System.out.println(div4); //1.5

        double div5 = 3 / 2.0;
        System.out.println(div5); //1.5

        //int div6 = 3.0 / 2;
        //System.out.println(div6);  //이런 경우는 형이 안 맞아서 오류

        //처리 과정
        //double result = (double) a / b;
        //double result = (double) 3 / 2;
        //double result = (double) 3 / (double) 2; //double + int이므로 더 큰 범위로 형변환
        //double result = 3.0 / 2.0; //(double / double) -> double이 된다.
        //double result = 1.5;
    }
}

//* 같은 타입끼리의 계산은 같은 타입의 결과를 낸다
//  * int + int는 int를, double + double은 double을
//* **서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.**
//  * int + long은 long + long으로 자동 형변환이 일어난다.
//  * int + double은 double + double로 자동 형변환이 일어난다.
