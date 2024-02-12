package cond;

public class Problem_02 {
    public static void main(String[] args) {
      int dis = 75;
      String tran = "이동수단";
      if(dis > 100){
          tran = "비행기";
      }
      else if (dis > 10 && dis <= 100){
          tran = "자동차";
      }
      else if (dis >1 && dis <= 10){
          tran = "자전거";
      }
      else if (dis <=1){
          tran = "도보";
      }
        System.out.println("이용수단 : " + tran);

    }
}
