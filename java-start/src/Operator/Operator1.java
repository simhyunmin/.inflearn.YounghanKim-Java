package Operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = "+ sum);

        int diff = a - b;
        System.out.println("a - b = "+diff);

        int multi = a*b;
        System.out.println("a * b = " + multi);

        int div = a/b;
        System.out.println("a / b = "+div);
        //0으로 나누는 것은 수학적으로도 안되기 때문에 자바에서도 역시 안된다.

        int mod = a % b;
        System.out.println("a % b = " + mod);


    }

}
