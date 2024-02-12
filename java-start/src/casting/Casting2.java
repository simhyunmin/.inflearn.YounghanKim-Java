package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //형변환 오류 발생
        //명시적 형변환(double -> int)
        intValue = (int) doubleValue;
        System.out.println(intValue);
        System.out.println(doubleValue);

        //명시적 형변환 과정
        //intValue = (int) doublerValue;
        //intValue = (int) 1.5; //doubleValue에 있는 값을 읽는다.
        //intValue = 1; //(int)로 형변환 한다. intValue에 int형인 숫자 1을 대입한다.

    }
}
