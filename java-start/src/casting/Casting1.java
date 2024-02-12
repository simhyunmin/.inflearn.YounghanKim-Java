package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println(longValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

//        intValue = doubleValue;
//        System.out.println(intValue);    //double형을 int형변환할 수는 없다.
                                           //크기에 맞는 값을 대입한다고 하더라도
        
        //내부적으로는 이렇게 동작한다.
        //자동 형변환
        //doubleValue = intValue
        //doubleValue = (double) intValue //형 맞추기
        //doubleValue = (double) 10 //변수 값 읽기
        //doubleValue = 10.0 //형 변환
        //이렇게 작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 직접 형변환을 하지 않아도 된다.
        //이러한 과정을 `자동 형변환`이라고 한다.


    }
}

//* 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
//  * 예)`int` -> `long` -> `double`
//* 큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다.
//  * 소수점 버림
//  * 오버플로우

//**작은 범위에서 큰 범위로 대입은 허용한다**
//자바에서 숫자를 표현할 수 있는 범위는 다음과 같다.
//`int < long < double`
//`int`보다는 `long`이, `long`보다는 `double`이 더 큰 범위를 표현할 수 있다.