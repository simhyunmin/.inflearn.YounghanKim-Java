package cond;

public class Problem_01 {
    public static void main(String[] args) {
        int score = 94;
        switch (score/10){
            case 10: case 9:
                System.out.println("학점은 A입니다.");
                break;
            case 8:
                System.out.println("학점은 B입니다.");
                break;
            case 7:
                System.out.println("학점은 C입니다.");
                break;
            case 6:
                System.out.println("학점은 D입니다.");
                break;
            default:
                System.out.println("학점은 F입니다.");
                break;
        }
    }



}
