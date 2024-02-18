package method;

public class MethodCasting1 {
    public static void main(String[] args) {
//        double number = 1.5;
//        printNumber(number); 컴파일 에러
          double number = 1.5;
          printNumber((int)number);
    }
    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }

}

//메서드 형변환 적용 가능 다만 형변환 규칙을 따른다.
//메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩 할 수 있다. 참고로 변환 타입은 인정하지 않는ㄴ다.



