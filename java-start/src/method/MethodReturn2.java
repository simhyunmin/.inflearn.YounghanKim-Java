package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(14);
        checkAge(20);
    }

    public static void checkAge(int age){
        if(age < 18){
            System.out.println(age + "살, 미성년자는 출입이 불가능");
            return;
        }

        System.out.println(age + "살 입장");

    }
}


//연산을 수행하고 반환값을 안 받을 수도 있다. 그런 경우에는 Main 함수 부분에
//호출만 하면 된다.


//메서드 호출과 값 전달
//**자바는 항상 변수의 값을 복사해서 대입한다.(매우 중요)
//이 대원칙은 반드시 이해해야 한다. 그러면 아무리 복잡한 상황에도 코드를 단순하게 이해할 수 있다.

