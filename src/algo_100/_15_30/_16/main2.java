package algo_100._15_30._16;

public class main2 {
    public static void main(String[] args) {
        int start = 2;
        int end = 5;

        // 바깥은 행으로, 안쪽을 열로
        for (int i= 1; i<=9; i++){

            for (int k= start; k<=end; k++){
                System.out.printf("%3d * %3d = %3d",k,i,k*i);
            }
            System.out.println();
        }

    }
}

