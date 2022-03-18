package algo_100._1_15._12;

public class main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(a(n));
        System.out.println("-------------------------------");
        System.out.println(b(n));

    }

    public static String a (int n){
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", (4*k)+1+i);
            }
            System.out.println();
        }
        return "";
    }

//  **********************************************************

    public static String b (int n){
        int arr[][] = new int[n][n];

        // 열 먼저 증가시키고 행 증가시키기
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                arr[k][i] = num;
                num++;
            }
        }


        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", arr[i][k]);
            }
            System.out.println();
        }
        return "";
    }
}
