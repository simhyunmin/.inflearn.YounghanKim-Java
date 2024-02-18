package method;

public class Problem_01 {
    public static void main(String[] args) {
        System.out.println("평균값:"+ave(1,2,3));
        System.out.println("평균값:"+ave(15,25,35));
    }
    public static double ave(int a, int b, int c){
        double average = (a + b + c) / 3.0;
        return average;
    }
}
