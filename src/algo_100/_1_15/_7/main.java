package algo_100._1_15._7;

public class main {
    public static void main(String[] args) {
        int input = 13;
        boolean a = false;
        for (int i = 2; i <= input-1; i++){ // i <= input/2; 도 가능하다
            if(input % i == 0){
                a = true;
            }
        }
        if(!a){
            System.out.println(input + "은 소수입니다.");
        }else{
            System.out.println("소수가 아닙니다.");
        }
    }
}
