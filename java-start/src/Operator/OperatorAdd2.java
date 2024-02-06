package Operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위, 후위 증감연산자
        // ++a : 증감 연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위(Prefix) 증감 연산자라고 한다.
        // a++ : 증감 연산자를 피연산자 뒤에 둘 수 있다. 이것을 뒤에 있다고 해서 후위(Postfix 증감 연산자라고 한다.
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println(b);
        System.out.println(a++); //후위 증감 연산자같은 경우는 sout이 먼저 읽고 출력한 다음에 연산을 진행한다.
        System.out.println(++a); //전위 증감 연산자같은 경우는 sout 이전에 먼저 연산을 한 다음에 출력을 한다.
        b = a++; //대입할 때도 마찬가지로 b = a를 먼저 수행한 다음에 a + 1을 수행한다.
        System.out.println(b);
        System.out.println(a);
    }
}
