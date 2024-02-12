package cond;

public class Problem_04 {
    public static void main(String[] args) {
        double rating = 7.1;

        if(rating <= 9) {
            System.out.println("어바웃타임을 추천");
        }
        if (rating <= 8){
            System.out.println("토이스토리 추천");
        }
        if(rating <= 7){
            System.out.println("고질라 추천");
        }
    }
}
