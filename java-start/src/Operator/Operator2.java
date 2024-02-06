package Operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기
        String result1 = "hello " + "world";

        //문자열과 문자열 더하기
        String s1 = "string1";
        String s2 = "string2";
        String result = s1 + s2;
        System.out.println(s1 + s2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10; //문자랑 숫자랑 더하면 숫자를 문자열로 바꿔버린다.
        System.out.println(result3);

        //str(String) + num(int)
        //"a + b = "(String) + num(int) //str 변수에서 값 조회
        //"a + b = "(String) + 20(int) //num 변수에서 값 조회
        //"a + b = "(String) + "20"(int->String) //숫자를 문자열로 변환
        //"a + b = 20" //결과



        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
