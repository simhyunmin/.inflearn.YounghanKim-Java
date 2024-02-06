package veriable;

public class Var6 {
    public static void main(String[] args) {
        int a;
        //System.out.println(a); 주석을 풀면 컴파일 에러 발생
        //우리가 게임 같은거를 할 때 플레이어의 레벨을 어떠한 메모리 공간에
        //저장했을 때 게임을 종료하면 그대로 메모리가 지워지는 게 아니고 계속
        //그 메모리 공간을 차지하고 있는 상태로 있는다. 이 때 어떠한 변수를
        //선언하고 그 공간을 차지하고 사용하려고 할 때 기전에 어떤 값이 있었는지는
        //아무도 모른다. 따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다.
        //이런 문제를 방지하기 위해 자바는 변수 초기화를 강제적으로 하게끔 한다.
        //클래스 변수와 인스턴스 변수는 자바가 자동으로 초기화를 진행해주는데
        //지연변수는 초기화를 해주지 않기 때문에 개발자가 직접 초기화를 진행해줘야한다.
    }
}