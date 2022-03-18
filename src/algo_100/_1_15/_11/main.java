package algo_100._1_15._11;

public class main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(a(n));
        System.out.println("---------------------------------------");
        System.out.println(b(n));

    }

    public static String a (int n){
        for (int i = 0; i < n; i++){
            // 짝수라면
            if(i % 2 == 0){
                for (int k = 0; k < n; k++) {
                    System.out.printf("%4d", (i*n)+1+k);
                }
                System.out.println();
            }

            // 홀수라면
            else{
                for (int k = n-1; k >= 0; k--) {
                    System.out.printf("%4d", (i*n)+1+k);
                }
                System.out.println();
            }
        }
        return null;
    }

// **************************************************************************
    public static  String b (int n){
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++){

            if(i % 2 == 0){ // 짝수라면
                for (int k = 0; k < n; k++) {
                    arr[i][k] = (i*n)+1+k;
                }
                System.out.println();
            } else{ // 홀수라면
                for (int k = n-1; k >= 0; k--) {
                    arr[i][k] = (i*n)+n-k;
                }
                System.out.println();
            }
        }
        for (int i = 0; i<n; i++){
            for (int k = 0; k<n; k++) {
                System.out.printf("%4d",arr[i][k]);
            }
            System.out.println();
        }
        return null;
    }
}

