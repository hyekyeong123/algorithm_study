package algo_100._15_30._16;

public class main {
    public static void main(String[] args) {
        int inputNum = 5;

        // 되도록이면 0부터 시작할 것
        for (int i = 0; i < inputNum; i++) {

            // 행마다 +1의 별이 출력됨
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
