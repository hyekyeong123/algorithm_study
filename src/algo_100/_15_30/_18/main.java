package algo_100._15_30._18;

public class main {
    public static void main(String[] args) {
        int n = 5;
        // i가 0행일때 k는 3까지 공백임
        // i가 4행일때 k는 공백 X

        for (int i = 0; i < n; i++) {

            // 각 행마다 항상 공백을 포함해서 5개씩 출력
            for (int k = 0; k < n; k++) {

                if( i < n-k-1){

                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
