package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(5, 10.5));
        System.out.println(add(1,2,3));

    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static  double add(int a, double b){
        System.out.println("2번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("3번 호출");
        return a + b + c;
    }
}


//오버로딩 실패
//```java
//int add(int a, int b)
//double add(int a, int b)
//```


//메서드 시그니처(method signature)
//메서드를 구별할 수 있는 규칙
//메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다. 메서드 시그니처는 메서드의 이름과 매개변수 타입(순서 포함)으로 구성되어 있다.
//쉽게 이야기해서 메서드를 구분할 수 있는 기준이다. 자바 입장에서는 각각의 메서드를 고유하게 구분할 수 있어야한다. 그래야 어떤 메서드를 호출 할 지 결정할 수 있다.
//따라서 메서드 오버로딩에서 설명한 것 처럼 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다.
//반환 타입은 시그니처에 포함되지 않는다. 방금 오버로딩이 실패한 두 메서드를 보자. 두  메서드는 `add(int a, int b)로 메서드 시그니처가 같다.
//따라서 메서드의 구분이 불가능하므로 컴파일 오류가 발생한다.

//오버로딩 성공
//```java
//add(int a, int b)
//add(int a, int b, int c)
//add(double a, double b)
//```