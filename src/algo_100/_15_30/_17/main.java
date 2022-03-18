package algo_100._15_30._17;

public class main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            // 각 행마다 항상 공백을 포함해서 5개씩 출력
            for (int k = 0; k < n; k++) {

                // i가 2행일때 j는 1까지 공백임임
               if(i > k){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
