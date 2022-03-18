package algo_100._1_15._13;

public class main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(a(n));
        System.out.println("-------------------------------");
//        System.out.println(b(n));

    }

    public static String a (int n){
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", num*k+(i+1));
            }
            num++;
            System.out.println();
        }
        return "";
    }

//  ******************************************************************

    public static String b (int n){
        int arr[][] = new int[n][n];

        // 배열 입력
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                arr[i][k] = (i+1)*(k+1);
            }
        }

        // 출력
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", arr[i][k]);
            }
            System.out.println();
        }

        return "";
    }
}
