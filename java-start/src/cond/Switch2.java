package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch(grade){
            case 1:
                coupon = 1000;

            case 2:
                coupon = 2000;

            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;


        }
        System.out.println(coupon);
    }
}
