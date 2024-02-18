package method;

public class MethodRef {
    public static int add(int a, int b){
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int sum1 = add(15, 10);
        System.out.println("결과1 출력:"+sum1);

        int sum2 = add(15, 20);
        System.out.println("결과2 출력:"+sum2);
        add(100,200);

    }

    }
    //메소드 호출하면 어떻게 실행되는지
    //int sum1 = add(5,10);  //add라는 메서드를 숫자 5,10을 전달하면서 호출한다.
    //int sum1 = 15;        //add(5, 10)이 실행된다. 실행 결과는 반환 값은 15이다.
    //sum1에 15 값이 저장된다.


//메서드 호출과 용어정리
//메서드를 호출할 때는 다음과 같이 메서드를 넘기는 값과 파라미터의 타입이 맞아야 한다. 물론 넘기는 값과 파라미터의 순서와 갯수도 맞아야 한다.

//```java
// 호출: call("hello", 20)
// 메서드 정의 : int call(String str, int age)
//```

//인수(Argument)
//여기서 `"hello"`, `20`처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라 한다.
//실무에서는 아규먼트, 인수, 인자라는 용어를 모두 사용한다.

//매개변수(Parameter)
//메서드를 정의할 때 선언한 변수인 `String str`, `int age`를 매개변수, 파라미터라 한다.
//메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
//실무에서는 매개변수, 파라미터 용어를 모두 사용한다.

//메서드 정의
//```java
// public static int add(int a, int b) {
    //메서드 본문, 실행 코드
//}
// 제어자 반환타입 메서드이름(매개변수 목록) {
// 메서드 본문
//}
//```

//* 제어자(Modifier):`public`, `static`과 같은 부분이다.
//* 반환 타입(Return Type): 메[서드가 실행 된 후 반환하는 데이터의 타입을 지정한다. 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 `void`를 사용해야 한다. 예) `void print(String str)`
//* 메서드 이름(Method Name): 메서드의 이름. 메서드를 호출하는데 사용된다.
//* 매개변수(Parameter):입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다. 매개변수는 옵션이다. 입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다. 예)`add()`
//* 메서드 본문(Method Body): 실제 메서드의 코드가 위치한다. 중괄호 `{}` 사이에 코드를 작성한다.



